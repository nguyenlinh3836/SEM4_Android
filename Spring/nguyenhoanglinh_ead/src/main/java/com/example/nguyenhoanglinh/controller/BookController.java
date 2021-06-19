package com.example.nguyenhoanglinh.controller;

import com.example.nguyenhoanglinh.entity.BookDetails;
import com.example.nguyenhoanglinh.entity.PublisherCatalogs;
import com.example.nguyenhoanglinh.service.BookService;
import com.example.nguyenhoanglinh.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    PublisherService publisherService;

    @GetMapping({"/", "/index"})
    public String Index(Model model){
        List<BookDetails> books = bookService.getAll();
        model.addAttribute("books",books);
        return "index";
    }

    @GetMapping({"/create"})
    public String Add(Model model){
        model.addAttribute("book", new BookDetails());
        List<PublisherCatalogs> publishers = publisherService.getPub();
        model.addAttribute("publishers",publishers);
        return "create";
    }

    @PostMapping(value = "/add")
    public String AddBook( @ModelAttribute BookDetails bookDetails, Model model){
        bookService.create(bookDetails);
        return "redirect:/index";
    }
//    @GetMapping
//    public String FindResult(Model model){
//
//    }



}
