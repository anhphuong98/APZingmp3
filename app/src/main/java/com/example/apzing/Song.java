package com.example.apzing;

public class Song {
    private String title;
    private int file;
    private int imageSong;
    public Song(String title, int file, int imageSong) {
        this.title = title;
        this.file = file;
        this.imageSong = imageSong;
    }

    public String getTitle() {
        return title;
    }

    public int getFile() {
        return file;
    }
    public int getImageSong() {
        return  imageSong;
    }
}
