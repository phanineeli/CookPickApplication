package com.cookpick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cookpick.dto.ProductDTO;
import com.cookpick.repository.ProductRepo;

@Service
public class ProdService {
@Autowired
private ProductRepo productrepo;

public String addProduct(ProductDTO productdto) {
	productrepo.addProduct(productdto);
	return "Product with "+productdto.getProductName()+" added successfully";
}
public List<ProductDTO> getProducts() {
	return productrepo.getProducts();
		
}
public String deleteproduct(String productName) {
	String str = "Product item "+productName+" does not exist";
	for(ProductDTO product :productrepo.getProducts()) {
		if(product.getProductName().equals(productName)) {
			productrepo.deleteproduct(product);
			str = "Product item :"+productName+" got deleted successfully";
			break;
		}
	}
	
	return str;
}
public String updateproduct(String productName, ProductDTO productdto) {
	// TODO Auto-generated method stub
	String str = "Product item "+productName+" does not exist";
	for(ProductDTO product: productrepo.getProducts()) {
		if(product.getProductName().equals(productName)) {
			if(productdto.getProductName()!=null)
			product.setProductName(productdto.getProductName());
			if(productdto.getProductVendor()!=null)
				product.setProductVendor(productdto.getProductVendor());
			if(productdto.getProductPrice()!=-1)
				product.setProductPrice(productdto.getProductPrice());
			if(productdto.getProductInStock()!=-1)
				product.setProductInStock(productdto.getProductInStock());
			str ="Product item "+productName+" updated successfully";
		}	
	}
	return str;
	}
}

