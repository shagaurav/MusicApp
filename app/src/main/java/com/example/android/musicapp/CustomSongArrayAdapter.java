package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomSongArrayAdapter extends ArrayAdapter<CustomSongArrayList> {

    public CustomSongArrayAdapter(Context context, ArrayList<CustomSongArrayList> object) {
        super( context, 0, object );
    }

    /**
     * Provides a view for an AdapterView.
     * return the View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.activity_song_list_item, parent, false );
        }

        // Get the {@link CustomSongArrayList} object located at this position in the list
        CustomSongArrayList currentWord = (CustomSongArrayList) getItem( position );

        // Find the TextView in the activity_song_list_item
        TextView songsTextView = (TextView) listItemView.findViewById( R.id.song_name );

        // set this text on the name TextView
        songsTextView.setText( currentWord.getSongName() );

        // Find the TextView in the activity_song_list_item
        TextView artistsTextView = (TextView) listItemView.findViewById( R.id.artist_name );
        artistsTextView.setText( currentWord.getArtistName() );

        // Return the whole list item layout.
        return listItemView;
    }
}
