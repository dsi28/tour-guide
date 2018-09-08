package com.example.android.tourguide;

public class Activ {
    static private int ActivIDCount=0;
    private int id;
    private String name;
    private String desc;
    private String address;

    public Activ(String name, String desc, String address) {
        ActivIDCount++;
        id=ActivIDCount;
        this.name = name;
        this.desc = desc;
        this.address = address;
    }

    public String getActivIDString() {
        return String.valueOf(id);
    }
    public int getActivID() {
        return id;
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
