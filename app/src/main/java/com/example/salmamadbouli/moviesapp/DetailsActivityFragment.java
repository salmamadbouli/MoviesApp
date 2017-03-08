package com.example.salmamadbouli.moviesapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailsActivityFragment extends Fragment {
    private ArrayList<Movie> movieList;
    Context context;

    public DetailsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getActivity().getIntent().getExtras();
        View rootView = inflater.inflate(R.layout.fragment_details, container, false);
        TextView name = (TextView) rootView.findViewById(R.id.detail_title);
        ImageView image = (ImageView) rootView.findViewById(R.id.detail_poster);
        TextView description = (TextView) rootView.findViewById(R.id.detail_synopsis);
        TextView releasedate = (TextView) rootView.findViewById(R.id.detail_release);
        TextView rating = (TextView) rootView.findViewById(R.id.detail_rating);
        Picasso.with(context).load("http://image.tmdb.org/t/p/w185/"+ bundle.getString("poster")).into(image);
        String title = bundle.getString("title");
        name.setText(title);
        String overview = bundle.getString("overview");
        description.setText(overview);
        String rate = bundle.getString("rate");
        rating.setText(rate);
        String release = bundle.getString("release");
        releasedate.setText(release);

    return rootView;
    }

}
