package com.backend.crwnapi.dataloader;

import com.backend.crwnapi.model.Category;
import com.backend.crwnapi.model.ClothingItem;

import java.util.ArrayList;
import java.util.List;

public class CategoryLoader {

    public static List<ClothingItem> getHatItems() {
        List<ClothingItem> hatItems = new ArrayList<>();

        hatItems.add(new ClothingItem(1, "Brown Brim", "https://i.ibb.co/ZYW3VTp/brown-brim.png"
                , 25));
        hatItems.add(new ClothingItem(2, "Blue Beenie", "https://i.ibb.co/ypkgK0X/blue-beanie.png"
                , 15));
        hatItems.add(new ClothingItem(3, "Brown Cowboy", "https://i.ibb.co/QdJwgmp/brown-cowboy.png"
                , 35));
        return hatItems;
    }

    public static List<ClothingItem> getSneakerItems() {
        List<ClothingItem> sneakerItems = new ArrayList<>();

        sneakerItems.add(new ClothingItem(10, "Adidas NMD", "https://i.ibb.co/0s3pdnc/adidas-nmd.png"
                , 220));
        sneakerItems.add(new ClothingItem(11, "Adidas Yeezy", "https://i.ibb.co/dJbG1cT/yeezy.png"
                , 285));
        return sneakerItems;
    }

    public static List<ClothingItem> getJacketItems() {
        List<ClothingItem> jacketItems = new ArrayList<>();

        jacketItems.add(new ClothingItem(18, "Black Jean Shearling", "https://i.ibb.co/XzcwL5s/black-shearling.png"
                , 125));
        jacketItems.add(new ClothingItem(19, "Blue Jean Jacket", "https://i.ibb.co/mJS6vz0/blue-jean-jacket.png"
                , 90));
        return jacketItems;
    }

    public static List<ClothingItem> getWomensItems() {
        List<ClothingItem> womensItems = new ArrayList<>();

        womensItems.add(new ClothingItem(23, "Blue Tanktop", "https://i.ibb.co/7CQVJNm/blue-tank.png"
                , 25));
        womensItems.add(new ClothingItem(24, "Floral Blouse", "https://i.ibb.co/4W2DGKm/floral-blouse.png"
                , 20));
        return womensItems;
    }

    public static List<ClothingItem> getMensItems() {
        List<ClothingItem> mensItems = new ArrayList<>();

        mensItems.add(new ClothingItem(30, "Camo Down Vest", "https://i.ibb.co/xJS0T3Y/camo-vest.png"
                , 325));
        mensItems.add(new ClothingItem(31, "Floral T-shirt", "https://i.ibb.co/qMQ75QZ/floral-shirt.png"
                , 20));
        return mensItems;
    }

    public static Category getHatCategory() {
        return new Category("Hats", getHatItems());
    }

    public static Category getSneakerCategory() {
        return new Category("Sneakers", getSneakerItems());
    }

    public static Category getJacketCategory() {
        return new Category("Jackets", getJacketItems());
    }

    public static Category getWomenCategory() {
        return new Category("Womens", getWomensItems());
    }

    public static Category getMenCategory() {
        return new Category("Mens", getMensItems());
    }

    public static List<Category> getCategories() {
        List<Category> categories= new ArrayList<>();
        categories.add(getHatCategory());
        categories.add(getSneakerCategory());
        categories.add(getJacketCategory());
        categories.add(getWomenCategory());
        categories.add(getMenCategory());
        return categories;
    }
}

