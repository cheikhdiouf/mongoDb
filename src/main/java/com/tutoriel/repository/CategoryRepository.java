package com.tutoriel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tutoriel.model.Category;
public interface CategoryRepository extends MongoRepository<Category,String> {

}
