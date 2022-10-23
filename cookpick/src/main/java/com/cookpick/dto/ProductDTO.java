package com.cookpick.dto;

public class ProductDTO {
long productCode;
String productName;
String productVendor;
Double productPrice;
 int productInStock;
public long getProductCode() {
	return productCode;
}
public void setProductCode(long productCode) {
	this.productCode = productCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductVendor() {
	return productVendor;
}
public void setProductVendor(String productVendor) {
	this.productVendor = productVendor;
}
public Double getProductPrice() {
	return productPrice;
}
public void setProductPrice(Double productPrice) {
	this.productPrice = productPrice;
}
public int getProductInStock() {
	return productInStock;
}
public void setProductInStock(int productInStock) {
	this.productInStock = productInStock;
} 
}
