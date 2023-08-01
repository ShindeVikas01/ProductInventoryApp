package com.infinity.productinventoryapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinity.productinventoryapp.entity.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long>{

}
