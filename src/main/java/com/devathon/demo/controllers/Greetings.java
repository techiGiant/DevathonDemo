package com.devathon.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greetings {
	
    @RequestMapping("/greetings/")
    @ResponseBody
    public String getGreetings() {
        return "Welcome to the site";
    } 	

}
