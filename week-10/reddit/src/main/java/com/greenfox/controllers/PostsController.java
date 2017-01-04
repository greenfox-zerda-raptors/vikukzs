package com.greenfox.controllers;

import com.greenfox.models.Post;
import com.greenfox.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Zsuzska on 2017. 01. 04..
 */
@Controller
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listPosts(Model model){
        model.addAttribute("posts", repository.findAll());
        return "posts/list";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        repository.delete(id);
        return new ModelAndView("redirect:/posts");
    }

    @GetMapping("/new")
    public String createNewPost(Model model) {
        model.addAttribute("post", new Post());
        return "posts/new";
    }

    @PostMapping("/new")
    public String addNewPost(@ModelAttribute Post post){
        repository.save(post);
        return "redirect:/posts";
    }

    @GetMapping("{id}/edit")
    public String editPost(Model model) {
        model.addAttribute("edit", new Post());
        return "posts/edit";
    }

    @PostMapping("/edit")
    public String addEditedPost(@ModelAttribute Post post) {
        repository.save(post);
        return "redirect:/posts";
    }

}
