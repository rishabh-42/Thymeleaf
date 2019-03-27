package com.example.thymeleaf.answer1to4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {



    @RequestMapping(value = "/form", method = RequestMethod.GET)
    String getData() {


        return "form";

    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    @ResponseBody
    String submitFormData(Model model, @ModelAttribute("modelAttribute") Employee employee) {


        System.out.println(employee.getFirstName());

        System.out.println(employee.getLastName());

        return employee.firstName + "  " + employee.lastName;


    }

    //answer10 11
    @RequestMapping(value = "/first",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView first(){

        return new ModelAndView("First").addObject("name","Answer 1");
    }

    @RequestMapping(value = "/getEmpTable", method = RequestMethod.GET)
    ModelAndView getEmpTable() {

        ModelAndView modelAndView = new ModelAndView("EmployeeTable");
        List<Employee> employeeList = Arrays.asList(new Employee("Rishabh", "Rajput")
                , new Employee("Vagish", "Dixit")
                , new Employee("Yukti", "Sharma"));

        modelAndView.addObject("empList",employeeList);

        return modelAndView;
    }
}
