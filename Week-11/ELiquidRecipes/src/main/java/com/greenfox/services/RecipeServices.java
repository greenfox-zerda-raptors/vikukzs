package com.greenfox.services;

import com.greenfox.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
@Service
public class RecipeServices {
    @Autowired
    RecipeRepository repository;

    Recipe recipe;

    public List<Recipe> sortRecipes() {
        return (List<Recipe>) repository.findAllByOrderByName();
    }


    public void save(Recipe recipe) {
        repository.save(recipe);
    }

    public void delete(Long id) {
        repository.delete(id);
    }


    public Recipe findARecipe(long id) {
        return repository.findOne(id);
    }

    public void upvote(Long id){
        recipe = repository.findOne(id);
        recipe.rating++;
        save(recipe);
    }

    public void downvote(Long id){
        recipe = repository.findOne(id);
        recipe.rating--;
        save(recipe);
    }

}
