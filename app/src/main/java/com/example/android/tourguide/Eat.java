package com.example.android.tourguide;

import java.util.ArrayList;
import java.util.List;

public class Eat {
    private int type; // Res: 0, Bar:1; not bool in case more options are added
    private String name;
    private int rating;
    private boolean fav; // No:false, Yes:true
    private String[] special;
    private static int id =0;

    public Eat(int type, String name, int rating, boolean fav) {
        this.type = type;
        this.name = name;
        this.rating = rating;
        this.fav = fav;
        this.id++;
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
    public void setName(String s){
        name= s;
    }
}
