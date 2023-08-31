package com.example.controller;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.business.dto.CombineDto;
import com.example.business.dto.CombineJsonArrayDto;
import com.example.business.entity.Posts;
import com.example.business.entity.Products;
import com.example.business.entity.Quotes;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@Controller
@Transactional
public class FetchDataController {

	@RequestMapping("/fetchDataPath")
	public String dispatchFecthData(ModelMap modelMap) {
		BaseAction baseAction = new BaseAction();
		CombineJsonArrayDto jsonDto = baseAction.commonFetch();

		JSONArray newPostsArray = jsonDto.getJsonPostsArray();
		JSONArray newProductsArray = jsonDto.getJsonProductsArray();
		JSONArray newQuotesArray = jsonDto.getJsonQuotesArray();

		List<CombineDto> combineDtoList = new ArrayList<CombineDto>();

		for (int postCount = 0; postCount < 10; postCount++) {
			for (int productCount = 0; productCount < 10; productCount++) {
				for (int quoteCount = 0; quoteCount < 10; quoteCount++) {

					JSONObject postObject = (JSONObject) newPostsArray.get(postCount);
					JSONObject productObject = (JSONObject) newProductsArray.get(productCount);
					JSONObject quoteObject = (JSONObject) newQuotesArray.get(quoteCount);

					Long postId = (Long) postObject.get("id");
					Long productId = (Long) productObject.get("id");
					Long quoteId = (Long) quoteObject.get("id");

					if (postId == productId && postId == quoteId) {
						CombineDto dto = new CombineDto();
						Posts postdto = new Posts();
						postdto.setId((Long) postObject.get("id"));
						postdto.setTitle((String) postObject.get("title"));
						postdto.setBody((String) postObject.get("body"));
						dto.setId(postId);
						dto.setPosts(postdto);

						Products productdto = new Products();
						productdto.setId((Long) productObject.get("id"));
						productdto.setTitle((String) productObject.get("title"));
						productdto.setPrice((Long) productObject.get("price"));
						dto.setProducts(productdto);

						Quotes quotedto = new Quotes();
						quotedto.setId((Long) quoteObject.get("id"));
						quotedto.setAuthor((String) quoteObject.get("author"));
						quotedto.setQuote((String) quoteObject.get("quote"));
						dto.setQuotes(quotedto);

						combineDtoList.add(dto);
					}

				}
			}
		}
		modelMap.addAttribute("combineDtoList", combineDtoList);

		return "fetch";
	}
}
