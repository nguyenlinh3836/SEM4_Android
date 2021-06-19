package com.example.nguyenhoanglinh.service;

import com.example.nguyenhoanglinh.entity.BookDetails;
import com.example.nguyenhoanglinh.entity.PublisherCatalogs;

import java.util.List;

public interface BookService {
    List<BookDetails> getAll();
    List<BookDetails> find(String name);
    BookDetails create(BookDetails book);
}
