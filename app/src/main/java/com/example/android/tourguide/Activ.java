package com.example.android.tourguide;

import android.os.Parcel;
import android.os.Parcelable;

public class Activ implements Parcelable {
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

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeString(address);
    }
    protected Activ(Parcel in){
        id=in.readInt();
        name= in.readString();
        desc=in.readString();
        address=in.readString();
    }
    public static final Creator<Activ> CREATOR = new Creator<Activ>() {
        @Override
        public Activ createFromParcel(Parcel source) {
            return new Activ(source);
        }
        @Override
        public Activ[] newArray(int size) {
            return new Activ[size];
        }
    };
}
