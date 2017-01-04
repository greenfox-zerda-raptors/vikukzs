package com.greenfox.services;

import com.greenfox.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Zsuzska on 2017. 01. 04..
 */
public interface PostRepository extends CrudRepository<Post, Long> {

}
