package com.backend.crwnapi;

import com.backend.crwnapi.model.Category;
import com.backend.crwnapi.model.ClothingItem;
import com.backend.crwnapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CrwnApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrwnApiApplication.class, args);
	}

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		List<ClothingItem> itemOneTwo = new ArrayList<>();
				itemOneTwo.add(new ClothingItem(1, "Brown Brim", "https://i.ibb.co/ZYW3VTp/brown-brim.png"
				, 25));
				itemOneTwo.add(new ClothingItem(2, "Blue Beenie", "https://i.ibb.co/ZYW3VTp/blue-beenie.png"
				, 15));
		Category hats = new Category("hats", itemOneTwo);
		this.categoryRepository.save(hats);
	}
}
