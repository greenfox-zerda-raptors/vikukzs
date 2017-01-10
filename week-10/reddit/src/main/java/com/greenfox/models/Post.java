package com.greenfox.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Zsuzska on 2017. 01. 04..
 */
@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String title;
    private String content;
    public int score;

    public Post(){}
    public Post(String username, String title, String content){
        this.username = username;
        this.title = title;
        this.content = content;
        this.score = 0;
    }

}
