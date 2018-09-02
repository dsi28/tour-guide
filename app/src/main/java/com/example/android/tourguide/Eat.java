package com.example.android.tourguide;

import java.util.ArrayList;
import java.util.List;

public class Eat {
    private int type; // Res: 0, Bar:1; not bool in case more options are added
    private String name;
    private int rating;
    private boolean fav; // No:false, Yes:true
    private String[] special;


    public Eat(int type, String name, int rating, boolean fav) {
        this.type = type;
        this.name = name;
        this.rating = rating;
        this.fav = fav;
        //this.special = special;
    }
    public int getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public String getRating() {
        return String.valueOf(rating);
    }
    public boolean getFav() {
        return fav;
    }
    public String[] getSpecial() {
        return special;
    }



    //setters
    public void setFav(boolean newVal){
        fav=newVal;
    }
}
