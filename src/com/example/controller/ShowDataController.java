package com.example.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.PostsDao;
import com.example.dao.ProductsDao;
import com.example.dao.QuotesDao;

@Controller
@Transactional
public class ShowDataController {
	@Autowired
	private PostsDao postDao;
	
	@Autowired
	private ProductsDao productDao;
	
	@Autowired
	private QuotesDao quoteDao;
	
	@RequestMapping("/showDataPath")
	public String dispatchShowData(ModelMap modelMap){
		modelMap.addAttribute("postList", this.postDao.getAll());
		modelMap.addAttribute("productList", this.productDao.getAll());
		modelMap.addAttribute("quoteList", this.quoteDao.getAll());
		return "show";
	}
}
