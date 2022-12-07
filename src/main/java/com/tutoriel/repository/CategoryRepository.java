package com.tutoriel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tutoriel.model.Category;

@CrossOrigin("*")
public interface CategoryRepository extends MongoRepository<Category,String> {

}
