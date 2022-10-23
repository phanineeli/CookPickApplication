package com.cookpick.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cookpick.dto.ProductDTO;
import com.cookpick.service.ProdService;

@RestController
public class Controller {
@Autowired
private ProdService prodservice;
	
@GetMapping
public String greet() {
	String day = LocalDate.now().getDayOfWeek().name();
	return "Welcome to "+ day.toLowerCase() +" Sale.";
	
}

@GetMapping("/products")
public List<ProductDTO> getProducts() {
	return prodservice.getProducts();
	
}

@PostMapping
public ResponseEntity<String> addProduct(@RequestBody ProductDTO productdto){
	String response = prodservice.addProduct(productdto);
	return ResponseEntity.ok(response);
	}
@PutMapping("/{productName}")
public String updateproduct(@PathVariable("productName") String productName,@RequestBody ProductDTO productdto) {
	
	return prodservice.updateproduct(productName,productdto);
	
}

@DeleteMapping("/{productName}")
public String deleteproduct(@PathVariable("productName") String productName) {
	return prodservice.deleteproduct(productName);
	}
}

