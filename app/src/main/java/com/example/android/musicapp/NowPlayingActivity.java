package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_now_playing );

        playing();
    }

    public void playing() {
        // Get extras from Intent.
        Intent songsIntent = getIntent();

        // Set the name of songs for playing.
        TextView songsTextView = findViewById( R.id.song_name );
        String songsForPlaying = songsIntent.getStringExtra( "songs" );
        songsTextView.setText( songsForPlaying );

        // Set the name of artist for playing.
        TextView artistsTextView = findViewById( R.id.song_artist );
        String artistsForPlaying = songsIntent.getStringExtra( "artists" );
        artistsTextView.setText( artistsForPlaying );
    }
}

