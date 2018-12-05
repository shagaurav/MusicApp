package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_playlists );
        // Find the View that shows the chillbeats category
        TextView chillbeats = findViewById( R.id.songs1 );

        // Set a click listener on that View
        chillbeats.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the chillbeats View is clicked on.
            @Override
            public void onClick(View view) {
                Intent chillBeatsIntent = new Intent( Playlists.this, Playlists1Activity.class );
                startActivity( chillBeatsIntent );
            }
        } );

        // Find the View that shows the heartbeats category
        TextView heartbeats = findViewById( R.id.songs2 );

        // Set a click listener on that View
        heartbeats.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the heartbeats View is clicked on.
            @Override
            public void onClick(View view) {
                Intent heartBeatsIntent = new Intent( Playlists.this, Playlists2Acticity.class );
                startActivity( heartBeatsIntent );
            }
        } );

        // Find the View that shows the play category
        TextView play = findViewById( R.id.songs3 );

        // Set a click listener on that View
        play.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the play View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent( Playlists.this, Playlists3Activity.class );
                startActivity( playIntent );
            }
        } );
    }
}
