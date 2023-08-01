package com.infinity.productinventoryapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infinity.productinventoryapp.model.ProductModel;

@Entity
@Table(name="producttb")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long p_Id;
	private String p_Name;
	private String p_Desc;
	private Integer p_Quantity;
	private Integer p_Price;
	private String p_Status;
	
	public Long getP_Id() {
		return p_Id;
	}

	public void setP_Id(Long p_Id) {
		this.p_Id = p_Id;
	}

	public String getP_Name() {
		return p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	public String getP_Desc() {
		return p_Desc;
	}

	public void setP_Desc(String p_Desc) {
		this.p_Desc = p_Desc;
	}

	public Integer getP_Quantity() {
		return p_Quantity;
	}

	public void setP_Quantity(Integer p_Quantity) {
		this.p_Quantity = p_Quantity;
	}

	public Integer getP_Price() {
		return p_Price;
	}

	public void setP_Price(Integer p_Price) {
		this.p_Price = p_Price;
	}

	public String getP_Status() {
		return p_Status;
	}

	public void setP_Status(String p_Status) {
		this.p_Status = p_Status;
	}

	public ProductEntity(ProductModel productModel) {
		
		this.p_Name = productModel.getP_Name();
		this.p_Desc = productModel.getP_Desc();
		this.p_Quantity = productModel.getP_Quantity();
		this.p_Price = productModel.getP_Price();
		this.p_Status = productModel.getP_Status();
	}

	
	
}
