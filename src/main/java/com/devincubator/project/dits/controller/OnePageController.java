package com.devincubator.project.dits.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import static com.devincubator.project.dits.controller.MainController.getPrincipal;

@Controller
public class OnePageController {


    @GetMapping(value = {"/", "/home"})
    public String homePage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "user/one";
    }

//    @GetMapping(value = "/t")
//    public String l(@RequestBody String topic) {
//        return "user/two";
//    }

}
