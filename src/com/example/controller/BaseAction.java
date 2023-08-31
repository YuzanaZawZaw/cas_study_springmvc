package com.example.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.example.business.dto.CombineJsonArrayDto;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseAction {

	public String fetchDataFromURL(String urlString) throws IOException {
		StringBuilder content = new StringBuilder();
		try (InputStream is = new URL(urlString).openStream()) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line);
			}
		}
		return content.toString();
	}

	public JSONArray fetch10DataSet(JSONArray arr) {
		int arrCount = arr.size();
		int count = 0;
		JSONArray newArr = new JSONArray();
		while (count < arrCount) {
			JSONObject object = (JSONObject) arr.get(count);
			newArr.add(object);
			count++;
			if (count >= 10) {
				break; // Stop after the first 10 data sets
			}
		}
		return newArr;
	}

	public CombineJsonArrayDto commonFetch() {
		CombineJsonArrayDto jsonDto = new CombineJsonArrayDto();

		String postUrl = "https://dummyjson.com/posts";
		String productUrl = "https://dummyjson.com/products";
		String quotepostUrl = "https://dummyjson.com/quotes";

		try {
			String postJsonString = fetchDataFromURL(postUrl);
			String productJsonString = fetchDataFromURL(productUrl);
			String quoteJsonString = fetchDataFromURL(quotepostUrl);

			JSONParser parser = new JSONParser();
			JSONObject postJsonObject = (JSONObject) parser.parse(postJsonString);

			JSONObject productJsonObject = (JSONObject) parser.parse(productJsonString);
			JSONObject quoteJsonObject = (JSONObject) parser.parse(quoteJsonString);

			// ------------------------------------for posts-------------------
			JSONArray postsArray = (JSONArray) postJsonObject.get("posts");

			JSONArray productsArray = (JSONArray) productJsonObject.get("products");
			JSONArray quotesArray = (JSONArray) quoteJsonObject.get("quotes");

			JSONArray newPostsArray = fetch10DataSet(postsArray);
			JSONArray newProductsArray = fetch10DataSet(productsArray);
			JSONArray newQuotesArray = fetch10DataSet(quotesArray);

			jsonDto.setJsonPostsArray(newPostsArray);
			jsonDto.setJsonProductsArray(newProductsArray);
			jsonDto.setJsonQuotesArray(newQuotesArray);

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jsonDto;
	}

}
