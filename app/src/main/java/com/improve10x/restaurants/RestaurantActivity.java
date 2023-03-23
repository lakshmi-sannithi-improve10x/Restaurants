package com.improve10x.restaurants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RestaurantActivity extends AppCompatActivity {
     public RestaurantItems[] restaurantItems;
     RecyclerView restaurantRv;
     public  RestaurantRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        initViews();
        createRestaurantData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        restaurantRv.setLayoutManager(new LinearLayoutManager(this));
        restaurantRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new RestaurantRvAdapter(restaurantItems);
    }

    private void initViews() {
        restaurantRv = findViewById(R.id.restaurant_rv);
    }

    private void createRestaurantData() {
        restaurantItems = new RestaurantItems[3];

        restaurantItems[0] = new RestaurantItems();
        restaurantItems[0].poster = "https://img.grouponcdn.com/deal/eBe1RurShS5tSrt5YqDy/Tr-700x420/v1/c700x420.jpg";
        restaurantItems[0].promote = "Promoted";
        restaurantItems[0].discount = "60% OFF";
        restaurantItems[0].discountUpTo = "Upt0$120";
        restaurantItems[0].time = "35mins";
        restaurantItems[0].dishName = "Itminaan Biryani - Dum Pukht";
        restaurantItems[0].rating = "4.1";
        restaurantItems[0].description = "Biryani, Desserts";
        restaurantItems[0].cost = "$250 for one";

        restaurantItems[1] = new RestaurantItems();
        restaurantItems[1].poster = "https://www.foodandwine.com/thmb/ErNZTmhSUt3HiOwy4JujFiQM9co=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Chicken-Tikka-Kebabs-FT-RECIPE0622-3c77b6c2efa04e1c946b320c6db30a91.jpg";
        restaurantItems[1].promote = "Promoted";
        restaurantItems[1].discount = "75 OFF";
        restaurantItems[1].discountUpTo = "Upt0$120";
        restaurantItems[1].time = "43mins";
        restaurantItems[1].dishName = "Prem Dhaba";
        restaurantItems[1].rating = "4.1";
        restaurantItems[1].description = "North Indian, Mughlai";
        restaurantItems[1].cost = "$150 for one";

        restaurantItems[2] = new RestaurantItems();
        restaurantItems[2].poster = "https://img.grouponcdn.com/deal/eBe1RurShS5tSrt5YqDy/Tr-700x420/v1/c700x420.jpg";
        restaurantItems[2].promote = "Promoted";
        restaurantItems[2].discount = "60% OFF";
        restaurantItems[2].discountUpTo = "Upt0$120";
        restaurantItems[2].time = "35mins";
        restaurantItems[2].dishName = "Itminaan Biryani - Dum Pukht";
        restaurantItems[2].rating = "4.1";
        restaurantItems[2].description = "Biryani, Desserts";
        restaurantItems[2].cost = "$250 for one";






    }
}