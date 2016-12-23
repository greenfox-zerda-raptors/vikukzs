package com.greenfox;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zsuzska on 2016. 12. 21..
 */
@Service
public class MealService {
    private List<Meal> mealsList = new ArrayList<Meal>(
            Arrays.asList(
                    new Meal(),
                    new Meal(),
                    new Meal()));

    public List<Meal> getMeals() {
        return mealsList;
    }

    public void addMeal(Meal meal){

    }
}