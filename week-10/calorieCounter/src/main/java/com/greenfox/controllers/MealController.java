package com.greenfox.controllers;

import com.greenfox.domain.Meal;
import com.greenfox.domain.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Zsuzska on 2017. 01. 02..
 */

@Controller
@RequestMapping("/meals")
public class MealController {

    @Autowired
    private MealRepository repository;

    @RequestMapping(value = "", method=RequestMethod.GET)
    public String listMeals(Model model) {

        model.addAttribute("meals", repository.findAll());
        return "meals/list";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        repository.delete(id);
        return new ModelAndView("redirect:/meals");
    }

    @GetMapping("/new")
    public String createNewMeal(Model model) {
        model.addAttribute("meal", new Meal());
        return "new";
    }

    @PostMapping("/new")
    public String addNewMeal(@ModelAttribute Meal meal){
        repository.save(meal);
        return "redirect:/meals";
    }

}
