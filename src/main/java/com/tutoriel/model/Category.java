package com.tutoriel.model;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document
@Data
@AllArgsConstructor @NoArgsConstructor  @Getter @Setter
public class Category {
	@Id
	private String  id;
	private String name;
	//quand il change la liste de category j'ai besoin que id du produit
	@DBRef
	private Collection<Product>products =new ArrayList<>();
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

}
