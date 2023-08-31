package com.example.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<PK extends Serializable,T> {
	@Autowired
	private SessionFactory sessionFactory;
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass=(Class<T>)
				((ParameterizedType)this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}
	protected Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	//select * from table where PK=
	public T getByKey(Long id){
		return (T)getSession().get(this.persistentClass, id);
	}
	
	
	//insert or update
	public void persist(T entity){
		getSession().persist(entity);
	}
	
	public void save(T entity){
		getSession().save(entity);
	}
	
	public void saveOrUpdate(T entity){
		getSession().saveOrUpdate(entity);
	}
	
	//delete
	public void delete(T entity){
		getSession().delete(entity);
	}
	//select
	public Criteria createEntityCriteria(){
		return getSession().createCriteria(this.persistentClass);
	}

}
