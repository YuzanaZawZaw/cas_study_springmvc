package com.example.business.dto;

import org.json.simple.JSONArray;

import com.example.business.entity.Posts;
import com.example.business.entity.Products;
import com.example.business.entity.Quotes;

public class CombineJsonArrayDto {
	private JSONArray jsonPostsArray;
	private JSONArray jsonProductsArray;
	private JSONArray jsonQuotesArray;
	public JSONArray getJsonPostsArray() {
		return jsonPostsArray;
	}
	public void setJsonPostsArray(JSONArray jsonPostsArray) {
		this.jsonPostsArray = jsonPostsArray;
	}
	public JSONArray getJsonProductsArray() {
		return jsonProductsArray;
	}
	public void setJsonProductsArray(JSONArray jsonProductsArray) {
		this.jsonProductsArray = jsonProductsArray;
	}
	public JSONArray getJsonQuotesArray() {
		return jsonQuotesArray;
	}
	public void setJsonQuotesArray(JSONArray jsonQuotesArray) {
		this.jsonQuotesArray = jsonQuotesArray;
	}
	
	public CombineJsonArrayDto(){
		
	}
	
	public CombineJsonArrayDto(JSONArray jsonPostsArray,JSONArray jsonProductsArray,JSONArray jsonQuotesArray){
			this.jsonPostsArray=jsonPostsArray;
			this.jsonProductsArray=jsonProductsArray;
			this.jsonQuotesArray=jsonQuotesArray;
	}
}
