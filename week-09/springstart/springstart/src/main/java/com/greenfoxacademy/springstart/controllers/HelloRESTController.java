package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zsuzska on 2016. 12. 19..
 */
@RestController
public class HelloRESTController {
    @RequestMapping
    public Greeting greeting(){
        Greeting greeting = new Greeting(1, "Hello, World!");
        return greeting;
    }
}
