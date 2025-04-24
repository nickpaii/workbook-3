package com.pluralsight;

public class Artwork {
    private String artist = "";
    private float price = 0;
    private String name = "";

    public Artwork(String artist, float price, String name) {
        this.artist = artist;
        this.price = price;
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
