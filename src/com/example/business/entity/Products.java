package com.example.business.entity;

import java.io.Serializable;

public class Products implements Serializable {
	private Long id;
	private String title;
	private String descriptions;
	private Long price;
	private Float discountPercentage;
	private Float rating;
	private Long stock;
	private String brand;
	private String category;
	private String thumbnail;
	private String image;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Float getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Float discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Products() {

	}

	public Products(Long Id, String Title, String Descriptions, Long Price, Float DiscountPercentage, Float Rating,
			Long Stock, String Brand, String Category, String Thumbnail, String Image) {
		this.id=Id;
		this.title=Title;
		this.descriptions=Descriptions;
		this.price=Price;
		this.discountPercentage=DiscountPercentage;
		this.rating=Rating;
		this.stock=Stock;
		this.brand=Brand;
		this.category=Category;
		this.thumbnail=Thumbnail;
		this.image=Image;
	}

}
