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
		return productRepo.findAll();
	}

	@Override
	public ProductEntity getProductById(Integer p_Id) {
		// TODO Auto-generated method stub
		return productRepo.getProductById(p_Id);
	}

	@Override
	public String updateProduct(Integer id,ProductModel productModel) {
		ProductEntity productEntity=getProductById(id);
		if(productEntity!=null)
		{
			productEntity.setP_Name(productModel.getP_Name());
			productEntity.setP_Desc(productModel.getP_Desc());
			productEntity.setP_Price(productModel.getP_Price());
			productEntity.setP_Quantity(productModel.getP_Quantity());
			productEntity.setP_Status(productModel.getP_Status());
			productRepo.save(productEntity);
			return "Product Updated";
		}else
		{
			return "Product not avialable";
		}
		
	}
	
	@Override
	public String deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
