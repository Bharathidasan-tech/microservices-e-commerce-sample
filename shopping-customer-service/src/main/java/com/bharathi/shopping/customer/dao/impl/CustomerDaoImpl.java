package com.bharathi.shopping.customer.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bharathi.shopping.customer.dao.CustomerDao;
import com.bharathi.shopping.customer.entity.User;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<User> findAll() {
		
     Session currentSession= entityManager.unwrap(Session.class);
		
		Query<User> query=currentSession.createQuery("from User", User.class);
		
		List<User> user=query.getResultList();
		return user;
	}

}
