package com.pblgllgs.recipeproject.repositories;

import com.pblgllgs.recipeproject.models.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient,Long> {
}
