package com.example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.example.business.entity.Posts;

@Repository("postDao")
public class PostsDao extends
	AbstractDao<Integer, Posts>{
	public List<Posts> getAll(){
		Criteria c=super.createEntityCriteria();
		return c.list();
	}
	
	public Posts getPostById(Long id){
		Posts c=super.getByKey(id);
		return c;
	}

	public void deletePost(Posts post) {
		super.delete(post);
	}
	
}
