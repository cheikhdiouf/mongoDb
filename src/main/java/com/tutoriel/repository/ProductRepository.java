package com.tutoriel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tutoriel.model.Product;
@CrossOrigin("*")
public interface ProductRepository extends MongoRepository<Product,String> {

}
