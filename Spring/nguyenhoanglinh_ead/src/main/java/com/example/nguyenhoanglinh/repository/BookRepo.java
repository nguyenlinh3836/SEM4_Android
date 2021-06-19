package com.example.nguyenhoanglinh.repository;

import com.example.nguyenhoanglinh.entity.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<BookDetails,Integer> {
    List<BookDetails> findAllByName(String name);

}
