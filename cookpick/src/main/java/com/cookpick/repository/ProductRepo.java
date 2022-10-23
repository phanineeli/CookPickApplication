package com.cookpick.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cookpick.dto.ProductDTO;



@Repository
public class ProductRepo {
	List<ProductDTO> products = new ArrayList<>();
	@PostConstruct
	public void initializer()
	{
		ProductDTO productdto = new ProductDTO();
		productdto.setProductCode(1001);
		productdto.setProductName("Parle-G");
		productdto.setProductVendor("Parle");
		productdto.setProductPrice(25.0);
		productdto.setProductInStock(1000);
		
		products.add(productdto);
	
		
		
	}
	
	public void addProduct(ProductDTO productdto) {
		products.add(productdto);
	}
	public List<ProductDTO> getProducts()
	{
		
		return products;
	}

	public void deleteproduct(ProductDTO product) {
		products.remove(product);
		
	}
}