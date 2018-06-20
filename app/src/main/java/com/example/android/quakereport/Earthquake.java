package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private double mMagnitute;
    private String mLocation;
    private Date mDate;
    private String mUrl;

    public Earthquake(double magnitude, String location, Date date, String url) {
        mMagnitute = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
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

    public String getUrl() {
        return mUrl;
    }
}
