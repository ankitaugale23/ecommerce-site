package com.example.Ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "quantity")
public class Quantity {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "pid")
    //@ManyToOne
    int pid;

    @Column(name = "bid")
    //@ManyToOne
    int bid;

    @Column(name = "sid")
    //@ManyToOne
    int sid;
    @Column(name = "quantity")
    int quantity;

    public Quantity() {
    }

    public Quantity(int id, int pid, int bid, int sid, int quantity) {
        this.id = id;
        this.pid = pid;
        this.bid = bid;
        this.sid = sid;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
