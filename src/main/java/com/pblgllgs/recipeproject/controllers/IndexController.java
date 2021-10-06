package com.pblgllgs.recipeproject.controllers;

import com.pblgllgs.recipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String getIndexPage(Model model){
        model.addAttribute("title","Recipe Home");
        model.addAttribute("titulo","My Recipes!!");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }

}
