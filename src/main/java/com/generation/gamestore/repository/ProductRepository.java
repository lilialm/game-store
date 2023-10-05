package com.generation.gamestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.gamestore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	public List<Product> findAllByNameContainingIgnoreCase(@Param("name") String name);
  
	
	
	

}
