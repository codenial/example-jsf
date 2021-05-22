package com.example.jsf.ejb;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import com.example.jsf.config.DBConfig;

public abstract class AbstractFacade<T> {

	private Session session; 
	private Class<T> entityClass;
	
	protected AbstractFacade(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	protected T save(T entity) {
		session = DBConfig.getSessionFactory().getCurrentSession();
		createTransaction();
		session.save(entity);
		session.getTransaction().commit();
		return entity;
	}
	
	protected List<T> findAll(){
		session = DBConfig.getSessionFactory().getCurrentSession();
		createTransaction();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(entityClass);
		Root<T> rootEntry = cq.from(entityClass);
		CriteriaQuery<T> all = cq.select(rootEntry);
		TypedQuery<T> allQuery = session.createQuery(all);
		return allQuery.getResultList();
	}
	
	protected T findById(String id) {
		session = DBConfig.getSessionFactory().getCurrentSession();
		createTransaction();
		return session.get(entityClass, id);
	}
	
	private void createTransaction() {
		if(session.getTransaction() == null || !session.getTransaction().isActive()) {
			session.beginTransaction();
		}		
	}
	
}
