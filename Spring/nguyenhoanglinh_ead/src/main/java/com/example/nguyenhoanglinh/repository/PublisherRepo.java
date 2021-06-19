package com.example.nguyenhoanglinh.repository;

import com.example.nguyenhoanglinh.entity.PublisherCatalogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<PublisherCatalogs, Integer> {

}
