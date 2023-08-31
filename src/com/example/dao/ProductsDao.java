package com.example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.example.business.entity.Products;

@Repository("productDao")
public class ProductsDao extends
	AbstractDao<Integer, Products>{
	public List<Products> getAll(){
		Criteria c=super.createEntityCriteria();
		return c.list();
	}

	public Products getProductById(Long id) {
		Products product=super.getByKey(id);
		return product;
	}

	public void deleteProduct(Products product) {
		super.delete(product);
		
	}

}
