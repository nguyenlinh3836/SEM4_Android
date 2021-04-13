package com.example.nguyenhoanglinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nguyenhoanglinh.database.AppDatabase;
import com.example.nguyenhoanglinh.database.ProductEntity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edName, edQty;
    private Button btAdd,btView;
    AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = AppDatabase.getAppDatabase(this);
        initview();
    }
    private void initview(){
        edName =(EditText) findViewById(R.id.edName);
        edQty = (EditText) findViewById(R.id.edQty);
        btAdd = (Button) findViewById(R.id.btAdd);
        btView = (Button) findViewById(R.id.btView);
        btAdd.setOnClickListener(this);
    }
    private void onAdd(){
        if(edName.getText().toString().isEmpty()){
            Toast.makeText(this,"Please enter product",Toast.LENGTH_LONG).show();
            return;
        }
        if(edQty.getText().toString().isEmpty()){
            Toast.makeText(this,"Please enter quantity",Toast.LENGTH_LONG).show();
            return;
        }
        ProductEntity product = new ProductEntity();
        product.name = edName.getText().toString();
        int qty = Integer.valueOf(edQty.getText().toString());
        product.quantity = qty;
        db.productDao().insertProduct(product);
        Toast.makeText(getApplicationContext(),"Data Save",Toast.LENGTH_LONG).show();
        edName.setText("");
        edQty.setText("");
    }
    private void onView(){
        Intent intent = new Intent(MainActivity.this,ListProduct.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View v) {
        if(v == btAdd){
            onAdd();
        }
        if(v == btView){
            onView();
        }
    }
}