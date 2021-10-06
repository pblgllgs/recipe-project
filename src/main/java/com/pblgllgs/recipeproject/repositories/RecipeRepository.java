package com.pblgllgs.recipeproject.repositories;

import com.pblgllgs.recipeproject.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository  extends CrudRepository<Recipe,Long> {

}
