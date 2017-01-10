package com.greenfox.services;

import com.greenfox.models.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
