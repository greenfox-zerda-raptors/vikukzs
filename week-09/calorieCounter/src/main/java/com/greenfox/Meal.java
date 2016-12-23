package com.greenfox;

import java.util.Date;

/**
 * Created by Zsuzska on 2016. 12. 21..
 */
public class Meal {
    Date date;
    String type;
    String description;
    int calories;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public Meal(){}

    public Meal(Date date, String type, String description, int calories) {
        this.date = date;
        this.type = type;
        this.description = description;
        this.calories = calories;
    }
}
