
package com.example.android.musicapp;


/**
 * {@link CustomSongArrayList}
 * It contains the name of the songs and artist.
 */

public class CustomSongArrayList {

    private String mSongName;
    private String mArtistName;

    CustomSongArrayList(String mSongName, String mArtistName) {
        this.mSongName = mSongName;
        this.mArtistName = mArtistName;
    }


    String getSongName() {
        return mSongName;
    }

    String getArtistName() {
        return mArtistName;
    }


}
