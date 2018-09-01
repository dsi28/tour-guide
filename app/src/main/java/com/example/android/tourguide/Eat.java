package com.example.android.tourguide;

import java.util.ArrayList;

public class Eat {
    private int type; // Res: 0, Bar:1; not bool in case more options are added
    private String name;
    private int rating;
    private boolean fav; // No:false, Yes:true
    private ArrayList<String> special;


    public Eat(int type, String name, int rating, boolean fav, ArrayList<String> special) {
        this.type = type;
        this.name = name;
        this.rating = rating;
        this.fav = fav;
        this.special = special;
    }

    public int getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }
    public boolean getFav() {
        return fav;
    }
    public ArrayList<String> getSpecial() {
        return special;
    }
}
