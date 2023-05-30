package com.example.perfectplacetravelapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TripsAdapter extends RecyclerView.Adapter<TripsAdapter.TripViewHolder>{

    private final List<Trips> trips;
    public TripsAdapter(List<Trips> trips)
    {
        this.trips = trips;
    }

    @NonNull
    @Override
    public TripViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TripViewHolder(
                LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.item_container_trip,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(TripsAdapter.TripViewHolder holder, int position) {
        holder.setTrip(trips.get(position));
    }

    @Override
    public int getItemCount() {
        return trips.size();
    }

    static class TripViewHolder extends RecyclerView.ViewHolder
    {
        private final ImageView imagePoster;
        private final TextView textName, TextPlace;
        private final RatingBar ratingBar;

        public TripViewHolder(View view)
        {
            super(view);
            imagePoster = view.findViewById(R.id.image_poster);
            textName = view.findViewById(R.id.trip_name);
            TextPlace = view.findViewById(R.id.trip_place);
            ratingBar = view.findViewById(R.id.rating_bar);
        }

        void setTrip(Trips trips)
        {
            imagePoster.setImageResource(trips.poster);
            textName.setText(trips.name);
            TextPlace.setText(trips.place);
            ratingBar.setRating(trips.rating);
        }

    }
}
