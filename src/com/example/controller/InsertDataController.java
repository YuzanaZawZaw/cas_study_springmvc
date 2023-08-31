package com.example.controller;

import javax.transaction.Transactional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.business.dto.CombineJsonArrayDto;
import com.example.business.entity.Posts;
import com.example.business.entity.Products;
import com.example.business.entity.Quotes;
import com.example.dao.PostsDao;
import com.example.dao.ProductsDao;
import com.example.dao.QuotesDao;

@Controller
@Transactional
public class InsertDataController {
	@Autowired
	private PostsDao postDao;
	
	@Autowired
	private ProductsDao productDao;
	
	@Autowired
	private QuotesDao quoteDao;
	
	@RequestMapping("/insertDataPath")
	public String dispatchInsertData(ModelMap modelMap){
		BaseAction baseAction=new BaseAction();
		CombineJsonArrayDto jsonDto = baseAction.commonFetch();

		JSONArray postsArray = jsonDto.getJsonPostsArray();
		JSONArray productsArray = jsonDto.getJsonProductsArray();
		JSONArray quotesArray = jsonDto.getJsonQuotesArray();
		
		int postsArrayCount = postsArray.size();
		int count = 0;
		while (count < postsArrayCount) {
			JSONObject post = (JSONObject) postsArray.get(count);
			
			Long id = (Long) post.get("id");
			String title = (String) post.get("title");
			String body = (String) post.get("body");
			Long userId = (Long) post.get("userId");
			
			Posts posts=new Posts();
            posts.setId(id);
            posts.setTitle(title);
            posts.setBody(body);
            posts.setUserId(userId);
            
            postDao.save(posts);
			count++;
		}
		
		
		int productCount = 0;
		while (productCount < productsArray.size()) {
			JSONObject product = (JSONObject) productsArray.get(productCount);
			
			Long id = (Long) product.get("id");
			String title = (String) product.get("title");
			Long price = (Long) product.get("price");
			String category = (String) product.get("category");
			
			Products products=new Products();
			products.setId(id);
			products.setTitle(title);
			products.setPrice(price);
			products.setCategory(category);
            
            productDao.save(products);
            productCount++;
		}
		
		int quoteCount = 0;
		while (quoteCount < quotesArray.size()) {
			JSONObject quote = (JSONObject) quotesArray.get(quoteCount);
			
			Long id = (Long) quote.get("id");
			String author = (String) quote.get("author");
			String squote = (String) quote.get("quote");
			
			Quotes quotes=new Quotes();
			quotes.setId(id);
			quotes.setAuthor(author);
			quotes.setQuote(squote);
			
            quoteDao.save(quotes);
            quoteCount++;
		}
		
		
		modelMap.addAttribute("successMsg", "Insert Successfully");
		return "insertPage";
	}
}
