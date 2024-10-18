package com.example.travel.Models;

public class CountryItem {

    private int imageResourse;
    private String title;
    private String key_id;
    private String favStatus;
    private String countrydesc;

    //constructor
    public CountryItem() {
    }

    public CountryItem(int imageResourse, String title, String key_id, String favStatus, String countrydesc) {
        this.imageResourse = imageResourse;
        this.title = title;
        this.key_id = key_id;
        this.favStatus = favStatus;
        this.countrydesc =countrydesc;
    }

    public int getImageResourse() {
        return imageResourse;
    }

    public void setImageResourse(int imageResourse) {
        this.imageResourse = imageResourse;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public String getFavStatus() {
        return favStatus;
    }

    public void setFavStatus(String favStatus) {
        this.favStatus = favStatus;
    }

    public String getCountrydesc() {
        return countrydesc;
    }

    public void setCountrydesc(String countrydesc) {
        this.countrydesc = countrydesc;
    }

}
