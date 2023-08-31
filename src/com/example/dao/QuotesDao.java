package com.example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.example.business.entity.Quotes;


@Repository("quoteDao")
public class QuotesDao extends
	AbstractDao<Integer, Quotes>{
	public List<Quotes> getAll(){
		Criteria c=super.createEntityCriteria();
		return c.list();
	}

	public Quotes getQuoteById(Long id) {
		Quotes quote=super.getByKey(id);
		return quote;
	}

	public void deleteQuote(Quotes quote) {
		super.delete(quote);
		
	}

}
