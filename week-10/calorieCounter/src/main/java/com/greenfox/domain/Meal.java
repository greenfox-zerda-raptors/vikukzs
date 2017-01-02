package com.greenfox.domain;

import sun.swing.StringUIClientPropertyKey;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Zsuzska on 2017. 01. 02..
 */

@Entity
public class Meal {
    @Id
    @GeneratedValue
    private long id;
    private String date;
    private String type;
    private String description;
    private int calories;

    public Meal(){}

    public Meal(String date, String type, String description, int calories){
        this.date = date;
        this.type = type;
        this.description = description;
        this.calories = calories;
    }

    public long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
