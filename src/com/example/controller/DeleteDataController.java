package com.example.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.business.entity.Posts;
import com.example.business.entity.Products;
import com.example.business.entity.Quotes;
import com.example.dao.PostsDao;
import com.example.dao.ProductsDao;
import com.example.dao.QuotesDao;

@Controller
@Transactional
public class DeleteDataController {
	@Autowired
	private PostsDao postDao;
	
	@Autowired
	private ProductsDao productDao;
	
	@Autowired
	private QuotesDao quoteDao;
	
	@RequestMapping("/deleteDataPath")
	public String dispatchDeleteData(@RequestParam(name = "Id") String id,ModelMap modelMap){
		System.out.println("START--------------------------------------------------------");
		Long longId=Long.parseLong(id);
		Posts post=postDao.getPostById(longId);
		Products product=productDao.getProductById(longId);
		Quotes quote=quoteDao.getQuoteById(longId);
		
		if(post!=null){
			System.out.println("post");
			postDao.deletePost(post);
			postDao.getAll();
		}
		if(product!=null){
			System.out.println("product");
			productDao.deleteProduct(product);
			productDao.getAll();
		}
		if(quote!=null){
			System.out.println("quote");
			quoteDao.deleteQuote(quote);
			quoteDao.getAll();
		}
		
		String message = "Item with ID " + id + " deleted successfully";
		System.out.println("END--------------------------------------------------------");
		System.out.println(message);
		modelMap.addAttribute("successMsg", message);
		
		return "deletePage";
	}
}
