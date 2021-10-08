package com.pblgllgs.recipeproject.controllers;

import com.pblgllgs.recipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe/show/{id}")
    public String showById(@PathVariable String id, Model model){
        Long ID = Long.parseLong(id);
        model.addAttribute("recipe", recipeService.findById(ID));
        return "recipe/show";
    }

}
