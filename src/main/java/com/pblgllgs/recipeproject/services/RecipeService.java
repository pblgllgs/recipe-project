package com.pblgllgs.recipeproject.services;

import com.pblgllgs.recipeproject.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
