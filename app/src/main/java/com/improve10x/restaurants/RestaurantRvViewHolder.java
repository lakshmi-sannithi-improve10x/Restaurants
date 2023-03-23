package com.improve10x.restaurants;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RestaurantRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView posterIv;
    public TextView promoteTxt;
    public TextView discountTxt;
    public TextView discountUpToTxt;
    public TextView timeTxt;
    public TextView dishNameTxt;
    public TextView ratingTxt;
    public TextView descriptionTxt;
    public TextView costTxt;
    public RestaurantRvViewHolder(@NonNull View itemView) {
        super(itemView);
        posterIv = itemView.findViewById(R.id.poster_iv);
        promoteTxt = itemView.findViewById(R.id.promote_txt);
        discountTxt = itemView.findViewById(R.id.discount_txt);
        discountUpToTxt = itemView.findViewById(R.id.discountupto_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
        dishNameTxt = itemView.findViewById(R.id.dishname_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        costTxt = itemView.findViewById(R.id.cost_txt);
    }
}
