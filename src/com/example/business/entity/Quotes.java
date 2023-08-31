package com.example.business.entity;

import java.io.Serializable;

public class Quotes implements Serializable {
	private Long id;
	private String quote;
	private String author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Quotes() {

	}

	public Quotes(Long Id, String Quote, String Author) {
		this.id = Id;
		this.quote = Quote;
		this.author = Author;
	}
}
