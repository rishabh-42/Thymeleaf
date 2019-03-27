package com.example.thymeleaf.answer9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerEnum {

    @RequestMapping("/userEnum")
    ModelAndView get(){

        return new ModelAndView("UserEnum");
    }
}
