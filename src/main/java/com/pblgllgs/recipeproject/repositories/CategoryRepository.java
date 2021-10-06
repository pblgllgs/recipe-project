package com.pblgllgs.recipeproject.repositories;

import com.pblgllgs.recipeproject.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional <Category> findByDescription(String description);
}
