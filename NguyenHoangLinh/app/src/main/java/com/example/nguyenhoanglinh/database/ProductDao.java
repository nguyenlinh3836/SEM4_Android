package com.example.nguyenhoanglinh.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProductDao {
    @Insert
    void insertProduct(ProductEntity product);
    @Query("SELECT * FROM Product")
    List<ProductEntity> getAll();
}
