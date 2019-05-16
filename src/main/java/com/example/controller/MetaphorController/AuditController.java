package com.example.controller.MetaphorController;

import com.example.bean.Auditedinstitutions;
import com.example.bean.Auditingbody;
import com.example.service.MetaphorService.AibusinessService;
import com.example.service.MetaphorService.AuditedinstitutionsService;
import com.example.service.MetaphorService.AuditingbodyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AuditController {
    @Resource
    private AuditingbodyService auditingbodyService;
    @Resource
    private AibusinessService aibusinessService;
    @Resource
    private AuditedinstitutionsService auditedinstitutionsService;

    @RequestMapping("/auditeeHtml")
    public String auditeeHtml(Model model){
        return "auditee";
    }

    @RequestMapping("/auditingHtml")
    public String auditingHtml(Model model){
        List<Auditingbody> byParentCode = auditingbodyService.findByParentCode("0");
        model.addAttribute("byParentCode",byParentCode);
        return "auditing";
    }

    @ResponseBody
    @RequestMapping("/getAuditBody")
    public List<Auditingbody> auditgetAuditBody(){
        return auditingbodyService.findAll();
    }

    @ResponseBody
    @RequestMapping("/getAdministrationByAbCode")
    public List<Auditedinstitutions> getAdministrationByAbCode(Model model,
                                      //页面传过来的管辖被审单位的审计单位编码
                                      @RequestParam(value = "abCode",required = false)String abCode){
        //去审计单位查询次编码是总部编码还是分部编码
        Auditingbody byAbCode = auditingbodyService.findByAbCode(abCode);
        //如果是总部编码(总部编码没有父级部门)
        if(byAbCode.getParentCode().equals("0")){
            //获取总部下所有分部的编码
            List<Auditingbody> byParentCode = auditingbodyService.findByParentCode(abCode);
            //把装有分部编码的集合传入到findByZong方法中
            return auditedinstitutionsService.findByZong(byParentCode);
        }else{
            //如果是分部编码直接查询他管理的被审部门
            return auditedinstitutionsService.findAll(abCode);
        }
    }

    /***
     * 添加审计机构
     * @param abCode
     * @param parentCode
     * @param abName
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveAduitBody")
    public String saveAduitBody(String abCode,String parentCode,String abName){
        return auditingbodyService.addAuditBody(abCode, parentCode, abName);
    }

    /***
     * 删除审计机构
     * @param abCode
     * @return
     */
    @ResponseBody
    @RequestMapping("/removeAuditBody")
    public boolean removeAuditBody(@RequestParam(value = "abCode",required = false)String abCode){
        //去数据库查传过来的代码是总部还是分部
        Auditingbody byAbCode = auditingbodyService.findByAbCode(abCode);
        //是总部
        if(byAbCode.getParentCode().equals("0")){
            //删除全分部
             auditingbodyService.removeAduitBodyParentCode(abCode);
            //删除总部
             return  auditingbodyService.removeAuditBodyByAbCode(abCode);
        }else{
            return auditingbodyService.removeAuditBodyByAbCode(abCode);
        }
    }

    @ResponseBody
    @RequestMapping("/showAuditBody")
    public Auditingbody showAuditBody(@RequestParam(value = "abCode",required = false)String abCode){
        return auditingbodyService.findByAbCode(abCode);
    }


    @RequestMapping("/auditByEr")
    public String auditByEr(Model model, @RequestParam(value = "parentCode",required = false)String parentCode){
        /*List<Auditingbody> allByParentCode = auditingbod/'14 yService.findAllByParentCode(parentCode); //查询二级菜单
        model.addAttribute("allByParentCode",allByParentCode);*/
        return "auditee::chengshi";
    }
}
