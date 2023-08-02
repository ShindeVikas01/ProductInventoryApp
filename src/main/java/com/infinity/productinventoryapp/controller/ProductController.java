package com.infinity.productinventoryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infinity.productinventoryapp.entity.ProductEntity;
import com.infinity.productinventoryapp.model.ProductModel;
import com.infinity.productinventoryapp.service.IProductService;

@RestController
@RequestMapping("/product/api")
public class ProductController {
	
	@Autowired
	IProductService iProductService;
	
	@PostMapping("/addproduct")
	public ProductEntity addProduct(@RequestBody ProductModel productModel ) {
		
		return iProductService.addProduct(productModel);
	}
	
	@GetMapping("/getallproducts")
	public ResponseEntity<List<ProductEntity>> getallproduct(){
		return new ResponseEntity<List<ProductEntity>>(iProductService.getAllProduct(),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getproductbyid/{p_Id}")
	public ProductEntity getproductbyid(@PathVariable("p_Id")Integer p_Id) {
		return iProductService.getProductById(p_Id);
	}
	
	@GetMapping("/updateproduct/{id}")
	public String updateProduct(@PathVariable("id")Integer id,@RequestBody ProductModel productModel) {
		return iProductService.updateProduct(id,productModel);
	}

	
}
