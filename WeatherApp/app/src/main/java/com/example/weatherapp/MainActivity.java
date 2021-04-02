package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weatherapp.adapter.WeatherAdapter;
import com.example.weatherapp.model.Item;
import com.example.weatherapp.network.APIManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvListView;
    List<Item> listData;
    WeatherAdapter adapter;
    TextView tvStatus,tvTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getListData();

        tvStatus = findViewById(R.id.tvStatus);
        tvTemp = findViewById(R.id.tvTemp);
        listData = new ArrayList<>();
        adapter = new WeatherAdapter(MainActivity.this,listData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        rvListView = findViewById(R.id.rvList);
        rvListView.setLayoutManager(layoutManager);
        rvListView.setAdapter(adapter);
    }
    private void getListData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIManager.SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APIManager service = retrofit.create(APIManager.class);

        service.getListData().enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                if(response.body() != null){
                    listData = response.body();
                    adapter.ReloadData(listData);
                    tvStatus.setText(listData.get(0).getIconPhrase());
                    tvTemp.setText(String.valueOf((int) listData.get(0).getTemperature().getValue()) + "\u00B0");
                }

            }
            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Fail",Toast.LENGTH_LONG).show();
            }
        });
    }
}