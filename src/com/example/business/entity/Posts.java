package com.example.business.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Posts implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String body;
	private Long userId;
	private String tags;
	private Integer reactions;
	
	
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Integer getReactions() {
		return reactions;
	}

	public void setReactions(Integer reactions) {
		this.reactions = reactions;
	}
	
	public Posts(){
		
	}
	
	public Posts(Long Id,String title,String body,Long userId,String tags,Integer reactions){
		this.id=Id;
		this.title=title;
		this.body=body;
		this.userId=userId;
		this.tags=tags;
		this.reactions=reactions;
		
	}

}
