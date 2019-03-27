package com.example.thymeleaf.answer10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoadController {

    @RequestMapping("/loaderForm")
    ModelAndView get() {


        return new ModelAndView("formWithLoader");
    }

    @RequestMapping(value = "/formLoad", method = RequestMethod.POST)
    @ResponseBody
    public void submit(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {

        System.out.println("form Loading");
        System.out.println(firstName + "  " + lastName);
        try {
            Thread.sleep(6000L);
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }


    }
}
