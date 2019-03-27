package com.example.thymeleaf.answer8;

import com.example.thymeleaf.answer5to7.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
public class Answer8 {

    @RequestMapping("/getColorTable")
    ModelAndView getColored(){
        List<User> userList = Arrays.asList(new User("Rishabh","Admin"),new User("Vagish","Moderator"),
                new User("Yatin","User"),new User("Yukti","Admin"));


        ModelAndView modelAndView = new ModelAndView("UserListColor");
        modelAndView.addObject("user",userList);
        return modelAndView;

    }
}
