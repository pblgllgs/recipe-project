package com.pblgllgs.recipeproject.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    Category category = new Category();


    @Test
    public void getId() throws Exception {
        Long idValue = 4L;
        category.setId(idValue);

        assertEquals(idValue,category.getId());
    }

    @Test
    void getDescription() {
    }

}