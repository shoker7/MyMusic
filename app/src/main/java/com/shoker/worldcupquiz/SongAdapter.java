package com.shoker.worldcupquiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {



    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Song currentSong = getItem(position);
        
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.tv_song_name);
        songNameTextView.setText(currentSong.getSongName());


        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.tv_artist_name);
        artistNameTextView.setText(currentSong.getArtistName());


       /* ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

            imageView.setImageResource(currentSong.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
            */
        return listItemView;
    }
}
