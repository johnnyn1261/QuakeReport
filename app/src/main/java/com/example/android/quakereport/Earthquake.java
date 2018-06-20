package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private double mMagnitute;
    private String mLocation;
    private Date mDate;

    public Earthquake(double magnitude, String location, Date date) {
        mMagnitute = magnitude;
        mLocation = location;
        mDate = date;
    }

    public double getMagnitude() {
        return mMagnitute;
    }

    public String getLocation() {
        return mLocation;
    }

    public Date getDate() {
        return mDate;
    }
}
