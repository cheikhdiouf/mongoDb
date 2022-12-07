package com.tutoriel;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tutoriel.model.Category;
import com.tutoriel.model.Product;
import com.tutoriel.repository.CategoryRepository;
import com.tutoriel.repository.ProductRepository;

@SpringBootApplication
public class MongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CategoryRepository categoryRepository, ProductRepository productRepository) {
		categoryRepository.deleteAll();
		return args -> {
			
			Stream.of("C1 Ordinateur", "C2 Clavier").forEach(c -> {

				categoryRepository.save(new Category(c.split(" ")[0], c.split(" ")[1], new ArrayList<>()));
			});
			categoryRepository.findAll().forEach(System.out::println);

			
			  productRepository.deleteAll(); Category
			  c1=categoryRepository.findById("C1").get();
			  Stream.of("P1","P2","P3","P4").forEach(name->{
			Product p= productRepository.save(new Product(null,name,Math.random()*1100,c1)); 
			 
			  c1.getProducts().add(p);
			  categoryRepository.save(c1);
			  
			  });
			  Category c2=categoryRepository.findById("C2").get();
			  Stream.of("P5","P6").forEach(name->{
			  
			  Product pp=productRepository.save(new Product(null,name,Math.random()*1100,c2));
			  c2.getProducts().add(pp);
			  categoryRepository.save(c2);
			  
			  });
			 	   
			  productRepository.findAll().forEach(p->{System.out.println(p.toString());
			  });
			 
		};

	}

}
