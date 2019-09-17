package com.devincubator.project.dits.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String getLogin(){
        return "login";
    }
}
