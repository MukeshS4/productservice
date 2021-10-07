package com.citius.productservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.citius.productservice.model.Product;
import com.citius.productservice.model.Tax;

@Service
public class ProductService {


	@Autowired
	private RestTemplate restTemplate;

	private List<Product> products = new ArrayList<>();

	public ProductService() {
		products.add(new Product(1, "Pen", 10, 0, 0));
		products.add(new Product(2, "Marker", 20, 0, 0));
	}

	public List<Product> getProducts() {
		for (Product p : products) {
			Map<String, Integer> params = new HashMap<>();
			params.put("id", p.getId());
			ResponseEntity<Tax> res = restTemplate.getForEntity("http://localhost:8081/taxes/{id}", Tax.class, params);
			Tax t = res.getBody();
			p.setTax(t.getTax());
			p.setGrossprice(p.getNetprice() + t.getTax());
		}
		return products;
	}

	public Product getProduct(int id) {

	
		Map<String, Integer> params = new HashMap<>();
		params.put("id", id);
		ResponseEntity<Tax> res = restTemplate.getForEntity("http://locahost:8081/taxes/{id}", Tax.class, params);
		Tax t = res.getBody();

		Product product = products.stream().filter((p) -> p.getId() == id).findFirst().get();
		product.setTax(t.getTax());
		product.setGrossprice(product.getNetprice() + product.getTax());
		return product;
	}

}
