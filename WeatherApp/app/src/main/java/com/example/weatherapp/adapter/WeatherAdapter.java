package com.example.weatherapp.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.weatherapp.R;
import com.example.weatherapp.model.Item;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter {
    private Activity activity;
    private List<Item> list;
    public WeatherAdapter(Activity activity, List<Item> list){
        this.activity = activity;
        this.list = list;
    }
    public void ReloadData(List<Item> list){
        this.list = list;
        this.notifyDataSetChanged();
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.item_weather,parent,false);
        WheatherHolders holders =new WheatherHolders(itemView);
        return holders;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        WheatherHolders hd = (WheatherHolders)holder;
        Item model = list.get(position);
        String dateset = convertTime(model.getDateTime());
        hd.tvDateTime.setText(dateset);
        String numberstr = Double.toString(model.getTemperature().getValue());
        hd.tvValue.setText(numberstr);
        if(model.getWeatherIcon() <10){
            Glide.with(activity).load("https://developer.accuweather.com/sites/default/files/0" + model.getWeatherIcon() + "-s.png").into(hd.ivIcon);
        } else {
            Glide.with(activity).load("https://developer.accuweather.com/sites/default/files/" + model.getWeatherIcon() + "-s.png").into(hd.ivIcon);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class WheatherHolders extends RecyclerView.ViewHolder{
        TextView tvDateTime,tvValue,tvStatus,tvTemp;
        ImageView ivIcon;

        public WheatherHolders(@NonNull View itemView) {
            super(itemView);
            tvDateTime =itemView.findViewById(R.id.tvTime);
            tvValue = itemView.findViewById(R.id.tvValue);
            ivIcon = itemView.findViewById(R.id.ivIcon);
            tvStatus = itemView.findViewById(R.id.tvStatus);

        }
    }

    public String convertTime(String inputTime) {
        SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = null;
        try {
            date = inFormat.parse(inputTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat outFormat = new SimpleDateFormat("ha");
        String goal = outFormat.format(date);
        return goal;
    }


}
