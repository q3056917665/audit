package com.example.controller.MetaphorController;

import com.example.bean.Aibusiness;
import com.example.bean.Auditingbody;
import com.example.service.MetaphorService.AibusinessService;
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

    @RequestMapping("/auditeeHtml")
    public String auditeeHtml(Model model){

        return "auditee";
    }

    @RequestMapping("/auditingHtml")
    public String auditingHtml(Model model){
        return "auditing";
    }

    @ResponseBody
    @RequestMapping("/getAuditBody")
    public List<Auditingbody> audit(){
        return auditingbodyService.findAll();
    }

    @RequestMapping("/auditByEr")
    public String auditByEr(Model model, @RequestParam(value = "parentCode",required = false)String parentCode){
        /*List<Auditingbody> allByParentCode = auditingbodyService.findAllByParentCode(parentCode); //查询二级菜单
        model.addAttribute("allByParentCode",allByParentCode);*/
        return "auditee::chengshi";
    }
}
