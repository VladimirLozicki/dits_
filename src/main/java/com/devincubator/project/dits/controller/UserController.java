package com.devincubator.project.dits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import static com.devincubator.project.dits.controller.MainController.getPrincipal;

@Controller
public class UserController {

    @GetMapping(value = {"/", "/home"})
    public String homePage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "user/one";
    }

    @GetMapping(value = {"/two"})
    public String twoPage(Model model) {
        model.addAttribute("user", getPrincipal());
        return "user/two";
    }

    @GetMapping(value = "/chooseTopic")
    public String logoutPage(Model model) {
        model.addAttribute("user", getPrincipal());
        return "user/two";
    }

    @GetMapping(value = "/statistics")
    public String statistics(Model model) {
        model.addAttribute("user", getPrincipal());
        return "user/three";
    }
}
