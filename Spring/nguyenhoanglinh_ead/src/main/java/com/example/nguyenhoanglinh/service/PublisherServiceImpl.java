package com.example.nguyenhoanglinh.service;

import com.example.nguyenhoanglinh.entity.PublisherCatalogs;
import com.example.nguyenhoanglinh.repository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {
    @Autowired
    PublisherRepo publisherRepo;
    @Override
    public List<PublisherCatalogs> getPub() {
        return publisherRepo.findAll();
    }
}
