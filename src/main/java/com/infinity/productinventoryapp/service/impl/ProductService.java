package com.infinity.productinventoryapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinity.productinventoryapp.entity.ProductEntity;
import com.infinity.productinventoryapp.model.ProductModel;
import com.infinity.productinventoryapp.repo.ProductRepo;
import com.infinity.productinventoryapp.service.IProductService;

@Service
public class ProductService implements IProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public ProductEntity addProduct(ProductModel productModel) {
		ProductEntity productEntity=new ProductEntity(productModel);
		return productRepo.save(productEntity);
	}

	@Override
	public List<ProductEntity> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity getProductById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity updateProduct(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
