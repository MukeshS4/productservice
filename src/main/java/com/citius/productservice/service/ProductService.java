package com.citius.productservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.citius.productservice.model.Product;

@Service
public class ProductService {
	
	private List<Product> products = new ArrayList<>(); 

	public ProductService() {
		products.add(new Product(1,"Pen",10,1,11));
		products.add(new Product(2,"Marker",20,1,11));
	}
	
	public List<Product> getProducts(){
		return products;
	}
}
