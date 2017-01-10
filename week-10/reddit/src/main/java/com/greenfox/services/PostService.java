package com.greenfox.services;

import com.greenfox.models.Post;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
@Service
public class PostService {
    PostRepository repository;
    Post post;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> getPostSorted() {
        return (List<Post>) repository.findAllByOrderByScoreDesc();
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    public void save(Post post) {
        repository.save(post);
    }

    public Post findAPost(Long id) {
        return repository.findOne(id);
    }

    public void upvote(Long id){
        Post post = repository.findOne(id);
        post.score++;
        save(post);
    }

    public void downvote(Long id){
        Post post = repository.findOne(id);
        post.score--;
        save(post);
    }

}