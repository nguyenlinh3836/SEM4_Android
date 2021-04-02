package com.example.weatherapp.network;

import com.example.weatherapp.model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIManager {
    String SERVER_URL = "http://dataservice.accuweather.com/";
    @GET("forecasts/v1/hourly/12hour/353412?apikey=vDSbiCdGwVy23qWLCL3JOzKFMgdzA8Dr&language=vi-vn&metric=true")
    Call<List<Item>> getListData();
}
