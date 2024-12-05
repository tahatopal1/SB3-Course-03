package com.project.demo.controller;

import com.project.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public SetterInjectedController() {
        System.out.println("Constructor method was called!");
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Setter method was called!");
        return greetingService.sayGreeting();
    }

}
