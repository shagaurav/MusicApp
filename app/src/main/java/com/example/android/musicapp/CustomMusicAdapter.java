package com.example.android.musicapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomMusicAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Music> arrayList;
    private MediaPlayer mediaPlayer;
    private Boolean flag = true;

    public CustomMusicAdapter(Context context, int layout, ArrayList<Music> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    //getCount() represents how many items are in the list
    public int getCount() {
        return arrayList.size();
    }

    @Override
    //get the data of an item from a specific position
    //int position represents the position of the item in the list
    public Object getItem(int position) {
        return null;
    }

    @Override
    //get the position id of the item from the list
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // create ViewHolder reference
        final ViewHolder viewHolder;

        //check to see if the reused view is null or not, if is not null then reuse it
        if (convertView == null) {
            viewHolder = new ViewHolder();

            //get the layout inflater
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );

            convertView = layoutInflater.inflate( layout, null );
            viewHolder.txtName = (TextView) convertView.findViewById( R.id.txtName );
            viewHolder.txtSinger = (TextView) convertView.findViewById( R.id.txtSinger );
            viewHolder.ivPlay = convertView.findViewById( R.id.ivPlay );
            viewHolder.ivStop = convertView.findViewById( R.id.ivStop );

            convertView.setTag( viewHolder );
        } else {

            // the getTag returns the viewHolder object set as a tag to the view
            viewHolder = (ViewHolder) convertView.getTag();


        }
        final Music music = arrayList.get( position );

        viewHolder.txtName.setText( music.getName() );
        viewHolder.txtSinger.setText( music.getSinger() );

        //play and pause music with mediaPlayer
        viewHolder.ivPlay.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //play music
                if (flag) {
                    mediaPlayer = MediaPlayer.create( context, music.getSong() );
                    flag = false;
                }
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();

                    viewHolder.ivPlay.setImageResource( R.drawable.play );

                    //pause music
                } else {
                    mediaPlayer.start();
                    viewHolder.ivPlay.setImageResource( R.drawable.pause );
                }
            }
        } );

        //stop music
        viewHolder.ivStop.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!flag) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    flag = true;

                }
                viewHolder.ivPlay.setImageResource( R.drawable.play );
            }
        } );

        return convertView;
    }

    // ViewHolder for TextView and ImageView
    private class ViewHolder {
        TextView txtName, txtSinger;
        ImageView ivPlay, ivStop;
    }
}
