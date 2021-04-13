package com.example.nguyenhoanglinh.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nguyenhoanglinh.R;
import com.example.nguyenhoanglinh.database.ProductEntity;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter {
    private Activity activity;
    List<ProductEntity> DataList;
    public ProductAdapter(Activity activity, List<ProductEntity> Datalist){
        this.activity = activity;
        this.DataList = Datalist;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= activity.getLayoutInflater().inflate(R.layout.list_data,parent,false);
        ViewHolder holder = new ViewHolder(itemview);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        

    }

    @Override
    public int getItemCount() {
        return DataList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvId,tvName,tvQty;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tvId);
            tvName = itemView.findViewById(R.id.tvName);
            tvQty = itemView.findViewById(R.id.tvQty);
        }
    }
}
