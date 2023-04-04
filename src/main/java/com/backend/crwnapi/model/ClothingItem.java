package com.backend.crwnapi.model;

import javax.persistence.*;

@Entity
@Table(name="clothingItem")
public class ClothingItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "identification")
     private int identification;
    @Column(name = "item_name")
     private String name;
    @Column(name = "url")
     private String url;
    @Column(name = "price")
     private int price;

    public ClothingItem(int identification, String name, String url, int price) {
        this.identification = identification;
        this.name = name;
        this.url = url;
        this.price = price;
    }

    public int getId() {
        return identification;
    }

    public void setId(int identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
