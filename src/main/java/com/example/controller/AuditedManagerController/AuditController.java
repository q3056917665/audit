package com.example.controller.AuditedManagerController;

import com.example.bean.Auditingbody;
import com.example.service.AuditingBody.AuditingbodyService;
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

    @RequestMapping("/auditeeHtml")
    public String tiao(Model model, @RequestParam(value = "parentCode",required = false)String parentCode){
        List<Auditingbody> all = auditingbodyService.findAllByParentCode("0"); //查询一级菜单
        List<Auditingbody> allByParentCode = auditingbodyService.findAllByParentCode(parentCode); //查询二级菜单
        model.addAttribute("all",all);
        model.addAttribute("allByParentCode",allByParentCode);
        return "auditee";
    }
}
