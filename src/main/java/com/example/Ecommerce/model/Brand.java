package com.example.Ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "brand")
public class Brand {
    @Id
    @Column(name = "brand_id")
    int id;
    @Column(name = "name")
    String name;


//@Column(name = "pid")
//@ManyToOne
    int pid;
    @Column(name = "price")
    double price;

    public Brand() {
    }

    public Brand(int id, String name, int pid, double price) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.price = price;
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

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
