package com.greenfox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by Zsuzska on 2016. 12. 20..
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/helloWorld")
    public String hello(Model model, @RequestParam(required = false, defaultValue = "Thymeleaf") String name){
        Date today = new Date();
        model.addAttribute("name", name);
        model.addAttribute("today", today);
        return "hello";
    }
}
