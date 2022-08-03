package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first_view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "askEmpDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetalis(){
        return "showEmpDetailsView";
    }
}
