package com.pblgllgs.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index","/index.html"})
    public String getIndexPage(Model model){
        model.addAttribute("title","Recipe Home");
        return "index";
    }

}
