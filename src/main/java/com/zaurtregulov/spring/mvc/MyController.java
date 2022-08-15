package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first_view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "askEmpDetailsView";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetalis(){
//        return "showEmpDetailsView";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetalis(HttpServletRequest request, Model model){
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("desription", "- Old God");
//
//        return "showEmpDetailsView";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetalis(@RequestParam("employeeName") String empName, Model model){

        empName = "Mr. " + empName + "!";
        model.addAttribute("nameAttribute", empName);

        return "showEmpDetailsView";
    }
}
