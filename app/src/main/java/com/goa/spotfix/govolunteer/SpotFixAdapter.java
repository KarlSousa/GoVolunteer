package com.goa.spotfix.govolunteer;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SpotFixAdapter extends RecyclerView.Adapter<SpotFixAdapter.SpotFixViewHolder>{

    static ArrayList<SpotFix> spot = new ArrayList<>();
    View view;

    public SpotFixAdapter(ArrayList<SpotFix> spot) {
        this.spot = spot;
    }

    @Override
    public SpotFixViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_spotfix,parent,false);
        SpotFixViewHolder placesViewHolder = new SpotFixViewHolder(view);
        return placesViewHolder;
    }

    @Override
    public void onBindViewHolder(SpotFixViewHolder holder, int position) {
        SpotFix spotFix = spot.get(position);
        Glide.with(view.getContext()).load(spotFix.getPicture()).into(holder.locationImage);
        holder.locationName.setText(spotFix.getLocation());
        holder.date.setText(spotFix.getDate());
        holder.time.setText(spotFix.getTime());
        holder.participantsCount.setText(spotFix.getNumberOfParticipants()+"");
    }

    @Override
    public int getItemCount() {
        return spot.size();
    }


    public class SpotFixViewHolder extends RecyclerView.ViewHolder{

        ImageView locationImage;
        TextView locationName, date, time, participantsCount;

        public SpotFixViewHolder(View itemView) {
            super(itemView);

            locationImage = (ImageView) view.findViewById(R.id.Logo);
            locationName = (TextView) view.findViewById(R.id.location);
            date = (TextView) view.findViewById(R.id.date);
            time = (TextView) view.findViewById(R.id.time);
            participantsCount = (TextView) view.findViewById(R.id.count);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
