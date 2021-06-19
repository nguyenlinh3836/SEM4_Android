package com.example.nguyenhoanglinh.entity;

import javax.persistence.*;

@Entity
@Table(name = "bookdetails")
public class BookDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "publisher")
    private int publisher;
    @Column(name = "author")
    private String Author;
    @Column(name = "genre")
    private String genre;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisher", referencedColumnName = "id",insertable = false,updatable = false)
    private PublisherCatalogs publisherCatalogs;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public PublisherCatalogs getPublisherCatalogs() {
        return publisherCatalogs;
    }

    public void setPublisherCatalogs(PublisherCatalogs publisherCatalogs) {
        this.publisherCatalogs = publisherCatalogs;
    }
}
