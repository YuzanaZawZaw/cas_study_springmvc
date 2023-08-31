package com.example.business.dto;

import com.example.business.entity.Posts;
import com.example.business.entity.Products;
import com.example.business.entity.Quotes;

public class CombineDto {
	private Long id;
	private Posts posts;
	private Products products;
	private Quotes quotes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Posts getPosts() {
		return posts;
	}
	public void setPosts(Posts posts) {
		this.posts = posts;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	public Quotes getQuotes() {
		return quotes;
	}
	public void setQuotes(Quotes quotes) {
		this.quotes = quotes;
	}

}
