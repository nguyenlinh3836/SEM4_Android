package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "phones")
public class PhoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Phone_name")
    private String phone_name;

    @Column(name = "Price")
    private Double price;

    @Column(name = "Description")
    private String des;

    @Column(name = "Brand")
    private String brand;

    public PhoneEntity() {
    }

    public PhoneEntity(String phone_name, Double price, String des, String brand) {
        this.id = id;
        this.phone_name = phone_name;
        this.price = price;
        this.des = des;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone_name() {
        return phone_name;
    }

    public void setPhone_name(String phone_name) {
        this.phone_name = phone_name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


}
