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

    public String getCategoryName() {
        return title;
    }

    public void setCategoryName(String categoryName) {
        this.title = categoryName;
    }

    public List<ClothingItem> getClothingItems() {
        return items;
    }

    public void setClothingItems(List<ClothingItem> clothingItems) {
        this.items = clothingItems;
    }
}

