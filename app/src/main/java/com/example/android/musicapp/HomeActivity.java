package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );

        // Find the View that shows the Chill category
        TextView chill = (TextView) findViewById( R.id.chill );

        // Set a click listener on that View
        chill.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the chill category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Chill}
                Intent chillIntent = new Intent( HomeActivity.this, Chill.class );

                // Start the new activity
                startActivity( chillIntent );
            }
        } );

        // Find the View that shows the retro category
        TextView retro = (TextView) findViewById( R.id.retro );

        // Set a click listener on that View
        retro.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the retro category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Retro}
                Intent retroIntent = new Intent( HomeActivity.this, Retro.class );

                // Start the new activity
                startActivity( retroIntent );
            }
        } );

        // Find the View that shows the oldies category
        TextView oldies = (TextView) findViewById( R.id.oldies );

        // Set a click listener on that View
        oldies.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Oldies}
                Intent oldiesIntent = new Intent( HomeActivity.this, Oldies.class );

                // Start the new activity
                startActivity( oldiesIntent );
            }
        } );

        // Find the View that shows the oldies category
        TextView songs = (TextView) findViewById( R.id.songs );

        // Set a click listener on that View
        songs.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Oldies}
                Intent songsIntent = new Intent( HomeActivity.this, Playlists.class );

                // Start the new activity
                startActivity( songsIntent );
            }
        } );

    }
}
