package com.example.nguyenhoanglinh.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "publisher")
public class PublisherCatalogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String Address;

    @Column(name = "contactperson")
    private String contactperson;

    @Column(name = "phonenumber")
    private String phonenumber;

    @OneToMany(mappedBy = "publisherCatalogs")
    private Set<BookDetails> bookDetails;

    public Set<BookDetails> getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(Set<BookDetails> bookDetails) {
        this.bookDetails = bookDetails;
    }

    public PublisherCatalogs() {
    }

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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


}
