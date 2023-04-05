package com.backend.crwnapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   @Column(name = "title")
    private String title;
//    @Column(name = "category_item")
    @OneToMany(cascade = CascadeType.ALL)
    private List<ClothingItem> items;

    public Category() {}
    public Category(String categoryName, List<ClothingItem> clothingItems) {
        super();
        this.title = categoryName;
        this.items = clothingItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ClothingItem> getItems() {
        return items;
    }

    public void setItems(List<ClothingItem> items) {
        this.items = items;
    }
}

