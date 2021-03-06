package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Oldies extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_oldies );

        //Create a list of songs
        songList = (ListView) findViewById( R.id.songList );
        arrayList = new ArrayList<>();

        //adds song name and singer name with the songs in the list
        arrayList.add( new Music( "GodFather", "Suzanne Vega", R.raw.godfather ) );
        arrayList.add( new Music( "Street Hawk", "Tangerine Dream", R.raw.street_hawk ) );

        // Create an {@link Adapter}, whose data source is a list of songs. The
        // adapter knows how to create layouts for each item in the list.
        // This list item layout contains a double {@link TextView}, which the adapter will set to
        // display a single song and singer.
        adapter = new CustomMusicAdapter( this, R.layout.custom_music_item, arrayList );

        // Make the {@link ListView} use the {@link Adapter} we created above, so that the
        // {@link ListView} will display list items for each song.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link Adapter} with the song name and singer name.
        songList.setAdapter( adapter );
    }
}
