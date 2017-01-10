package com.greenfox.controllers;

import com.greenfox.models.Recipe;
import com.greenfox.services.RecipeRepository;
import com.greenfox.services.RecipeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
@Controller
@RequestMapping("/recipes")
public class RecipesController {

    @Autowired
    RecipeServices service;

    @Autowired
    RecipeRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listPosts(Model model){
        model.addAttribute("recipes", repository.findAll());
        return "recipes/list";
    }

    @GetMapping("/new")
    public String createNewRecipe(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "recipes/new";
    }

    @PostMapping("/new")
    public String addNewRecipe(@ModelAttribute Recipe post){
        service.save(post);
        return "redirect:/recipes";
    }
}
