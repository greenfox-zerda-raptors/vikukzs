package com.greenfox.controllers;

import com.greenfox.domain.Post;
import com.greenfox.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Zsuzska on 2016. 12. 29..
 */
@Controller
@RequestMapping(value = "/posts")
public class PostController {

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

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newProject() {
        return "posts/new";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("message") String comment) {
        repository.save(new Post(comment));
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("post_id") long id,
                               @RequestParam("message") String message) {
        Post post = repository.findOne(id);
        post.setMessage(message);
        repository.save(post);
        return new ModelAndView("redirect:/posts");
    }

}
