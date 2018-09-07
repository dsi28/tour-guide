package com.example.android.tourguide;

public class Activ {
    static private int ActivID=0;
    private String name;
    private String desc;
    private String address;

    public Activ(String name, String desc, String address) {
        ActivID++;
        this.name = name;
        this.desc = desc;
        this.address = address;
    }

    public int getActivID() {
        return ActivID;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    public String getAddress() {
        return address;
    }
}
