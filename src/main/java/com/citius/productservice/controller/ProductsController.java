package com.citius.productservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.citius.productservice.model.Product;
import com.citius.productservice.service.ProductService;

@RestController
public class ProductsController {
	private static Logger log = LoggerFactory.getLogger(ProductsController.class);
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> get(){
		return new ResponseEntity<List<Product>>(productService.getProducts(),HttpStatus.OK);
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable int id) {
		log.info("productservice:");
		return productService.getProduct(id);
		
	}
	
}
