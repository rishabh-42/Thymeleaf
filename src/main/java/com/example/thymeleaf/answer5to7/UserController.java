package com.example.thymeleaf.answer5to7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class UserController {



    @RequestMapping(value = "getRole",method = RequestMethod.GET)
    ModelAndView getRole(User user){

        user.setName("Rishabh");

//        user.setRole("Admin");

        user.setRole("User");


        ModelAndView modelAndView = new ModelAndView("UserRole");
        modelAndView.addObject("user",user);


        return modelAndView;
    }

    @RequestMapping("/serverTime")
    ModelAndView serverTime(){


        return new ModelAndView("ServerTime");
    }

    @RequestMapping("/getTime")
    @ResponseBody
    String getTime(){

        return LocalDateTime.now().toString();
    }


}


