package com.tutoriel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tutoriel.model.Product;

public interface ProductRepository extends MongoRepository<Product,String> {

}
