package com.backend.crwnapi.controller;

import com.backend.crwnapi.dataloader.CategoryLoader;
import com.backend.crwnapi.model.Category;
import com.backend.crwnapi.model.ClothingItem;
import com.backend.crwnapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin( origins = "*")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> getCategories(){
          return CategoryLoader.getCategories();
//        return this.categoryRepository.findAll();
    }
}
