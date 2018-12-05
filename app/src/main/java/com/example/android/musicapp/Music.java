package com.example.android.musicapp;

public class Music {
    private String name;
    private String singer;
    private int song;

    // generate constructor for name:String, singer:String and song:int
    public Music(String name, String singer, int song) {
        this.name = name;
        this.singer = singer;
        this.song = song;
    }

    //generate getter and setter for name:String, singer:String and song:int
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public int getSong() {
        return song;
    }
}
