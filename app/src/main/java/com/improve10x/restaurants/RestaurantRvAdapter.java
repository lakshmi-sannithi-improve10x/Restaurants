package com.improve10x.restaurants;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class RestaurantRvAdapter extends RecyclerView.Adapter<RestaurantRvViewHolder> {
    public RestaurantItems[] items;
    public RestaurantRvAdapter(RestaurantItems[] restaurantItems){
        items = restaurantItems;
    }
    @NonNull
    @Override
    public RestaurantRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.restaurant_items,parent,false);
        RestaurantRvViewHolder viewHolder = new RestaurantRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantRvViewHolder holder, int position) {
        RestaurantItems item = items[position];
        holder.promoteTxt.setText(item.promote);
        holder.discountTxt.setText(item.discount);
        holder.discountUpToTxt.setText(item.discountUpTo);
        holder.timeTxt.setText(item.time);
        holder.dishNameTxt.setText(item.dishName);
        holder.ratingTxt.setText(item.rating);
        holder.descriptionTxt.setText(item.description);
        holder.costTxt.setText(item.cost);
        Picasso.get().load(item.poster).into(holder.posterIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
