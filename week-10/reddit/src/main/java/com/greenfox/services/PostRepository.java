package com.greenfox.services;

import com.greenfox.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Zsuzska on 2017. 01. 04..
 */
public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByScoreDesc();
}
