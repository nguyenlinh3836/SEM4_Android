package com.example.nguyenhoanglinh.service;

import com.example.nguyenhoanglinh.entity.BookDetails;
import com.example.nguyenhoanglinh.entity.PublisherCatalogs;
import com.example.nguyenhoanglinh.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepo bookRepo;
    @Override
    public List<BookDetails> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public List<BookDetails> find(String name) {
        return bookRepo.findAllByName(name);
    }

    @Override
    public BookDetails create(BookDetails book) {
        return bookRepo.save(book);
    }
}
