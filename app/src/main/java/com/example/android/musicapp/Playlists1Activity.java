package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Playlists1Activity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_list );

        // Create an array of mMusicData.
        ArrayList<CustomSongArrayList> mMusicData = new ArrayList<CustomSongArrayList>();

        // Adding mMusicData to an array.
        mMusicData.add( new CustomSongArrayList( "Attention",
                "Charlie Puth-Attention" ) );
        mMusicData.add( new CustomSongArrayList( "Something Just Like This",
                "The ChainSmokers, Coldplay" ) );
        mMusicData.add( new CustomSongArrayList( "Cheap Thrills",
                "Sia-Cheap Thrills" ) );
        mMusicData.add( new CustomSongArrayList( "Sugar",
                "Maroon5-V(Deluxe)" ) );
        mMusicData.add( new CustomSongArrayList( "Shape of You",
                "Ed Sheeran Shape of You" ) );

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        CustomSongArrayAdapter adapter = new CustomSongArrayAdapter( this, mMusicData );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // play_list file.
        ListView listView = (ListView) findViewById( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        listView.setAdapter( adapter );

        // Set OnClickListener on ListView to identify the item on ListView clicked by user
        // Text on the ListView item clicked is passed on to NowPlayingActivity
        listView.setOnItemClickListener( this );
    }

    /**
     * Method to identify ListView item clicked and launch NowPlayngActiviy
     */
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        // Get the selected CustomSongArrayList.
        CustomSongArrayList currentCustomSongArrayList = (CustomSongArrayList) adapterView.getItemAtPosition( position );

        // Extract strings from CustomSongArrayList object.
        String songsForPlaying = currentCustomSongArrayList.getSongName();
        String artistsForPlaying = currentCustomSongArrayList.getArtistName();

        // Sending the name of song and the artist to NowPlayingActivity.
        Intent customSongIntent = new Intent( this, NowPlayingActivity.class );
        customSongIntent.putExtra( "songs", songsForPlaying );
        customSongIntent.putExtra( "artists", artistsForPlaying );
        startActivity( customSongIntent );
    }
}
