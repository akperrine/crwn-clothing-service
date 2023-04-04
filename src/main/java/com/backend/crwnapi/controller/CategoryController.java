package com.backend.crwnapi.controller;

import com.backend.crwnapi.model.Category;
import com.backend.crwnapi.model.ClothingItem;
import com.backend.crwnapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("categories")
    public List<Category> getCategories(){
        List<Category> categories = new ArrayList<>();
        List<ClothingItem> itemOneTwo = new ArrayList<>();
        itemOneTwo.add(new ClothingItem(1, "Brown Brim", "https://i.ibb.co/ZYW3VTp/brown-brim.png"
                , 25));
        itemOneTwo.add(new ClothingItem(2, "Blue Beenie", "https://i.ibb.co/ZYW3VTp/blue-beenie.png"
                , 15));
        Category hats = new Category("Hats", itemOneTwo);
        categories.add(hats);

        List<ClothingItem> itemOneTwo2 = new ArrayList<>();
        itemOneTwo2.add(new ClothingItem(10, "Adidas NMD", "https://i.ibb.co/ZYW3VTp/adidas-nmd.png"
                , 220));
        itemOneTwo2.add(new ClothingItem(11, "Adidas Yeezy", "https://i.ibb.co/ZYW3VTp/adidas-yeezy.png"
                , 285));
        Category sneakers = new Category("Sneakers", itemOneTwo2);
        categories.add(sneakers);

        List<ClothingItem> itemOneTwo3 = new ArrayList<>();
        itemOneTwo3.add(new ClothingItem(18, "Black Jean Shearling", "https://i.ibb.co/ZYW3VTp/black-shearling.png"
                , 125));
        itemOneTwo3.add(new ClothingItem(19, "Blue Jean Jacket", "https://i.ibb.co/ZYW3VTp/blue-jean-jacket.png"
                , 90));
        Category jackets = new Category("Jackets", itemOneTwo3);
        categories.add(jackets);

        List<ClothingItem> itemOneTwo4 = new ArrayList<>();
        itemOneTwo4.add(new ClothingItem(23, "Blue Tanktop", "https://i.ibb.co/ZYW3VTp/blue-tank.png"
                , 25));
        itemOneTwo4.add(new ClothingItem(24, "Floral Blouse", "https://i.ibb.co/ZYW3VTp/floral-blouse.png"
                , 20));
        Category womans = new Category("Womans", itemOneTwo4);
        categories.add(womans);

        List<ClothingItem> itemOneTwo5 = new ArrayList<>();
        itemOneTwo5.add(new ClothingItem(30, "Camo Down Vest", "https://i.ibb.co/ZYW3VTp/camo-vest.png"
                , 325));
        itemOneTwo5.add(new ClothingItem(31, "Floral T-shirt", "https://i.ibb.co/ZYW3VTp/floral-shirt.png"
                , 20));
        Category mens = new Category("Mens", itemOneTwo5);
        categories.add(mens);
        return categories;
//        return this.categoryRepository.findAll();
    }
}
