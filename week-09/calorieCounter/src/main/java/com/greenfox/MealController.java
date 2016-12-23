package com.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zsuzska on 2016. 12. 21..
 */
@Controller
@RequestMapping(value = "/meals")
public class MealController {

    @RequestMapping(value = {"/", "/list"})
    public String meal(Model model){
        model.addAttribute("meals", mealService.getMeals());
        return "meals";
    }


    private MealService mealService;

    @Autowired
    public MealController(MealService todoService){
        this.mealService = mealService;
    }
}
