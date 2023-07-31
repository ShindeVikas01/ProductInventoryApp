package com.infinity.productinventoryapp.service;

import java.util.List;

import com.infinity.productinventoryapp.entity.ProductEntity;
import com.infinity.productinventoryapp.model.ProductModel;


public interface IProductService {

	public ProductEntity addProduct(ProductModel productModel); 
	public List<ProductEntity> getAllProduct();
	public ProductEntity getProductById(Integer id);
	public String deleteProduct(Integer id);
	public ProductEntity updateProduct(Integer id);
}
