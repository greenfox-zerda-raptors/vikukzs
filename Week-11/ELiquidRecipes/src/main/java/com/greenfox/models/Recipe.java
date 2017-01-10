package com.greenfox.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double pg;
    private double vg;
    private double aroma1;
    private double aroma2;
    private double aroma3;
    private double nicotine;
    private int rating;

    public Recipe(){}
    public Recipe(String name, double pg, double vg, double aroma1, double aroma2, double aroma3, double nicotine){
        this.name = name;
        this.pg = pg;
        this.vg = vg;
        this.aroma1 = aroma1;
        this.aroma2 = aroma2;
        this.aroma3 = aroma3;
        this.nicotine = nicotine;
        this.rating = 0;
    }

}
