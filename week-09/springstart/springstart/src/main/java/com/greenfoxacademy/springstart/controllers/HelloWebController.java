package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Zsuzska on 2016. 12. 19..
 */
@Controller
public class HelloWebController {
    AtomicLong atomicLong = new AtomicLong(1);

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        model.addAttribute("counter", "This page was loaded " + atomicLong.getAndIncrement() + " times.");
        return "greeting";
    }
}
