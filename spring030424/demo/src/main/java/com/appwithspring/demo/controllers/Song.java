package com.appwithspring.demo.controllers;

public class Song {
    private String name;
    private String artist;
    private String album;

    // Constructor
    public Song(String name, String artist, String album) {
        this.name = name;
        this.artist = artist;
        this.album = album;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
