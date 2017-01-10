package com.greenfox.services;

import com.greenfox.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
@Service
public class RecipeServices {
    @Autowired
    RecipeRepository repository;
    public void save(Recipe recipe) {
        repository.save(recipe);
    }

}
