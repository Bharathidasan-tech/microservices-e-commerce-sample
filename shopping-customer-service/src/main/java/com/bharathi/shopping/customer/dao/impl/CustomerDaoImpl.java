package com.bharathi.shopping.customer.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bharathi.shopping.customer.dao.CustomerDao;
import com.bharathi.shopping.customer.entity.Users;

@Transactional
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Users> findAll() {
		
		
		return (List<Users> )entityManager.createQuery("from Users u ORDER BY u.id",Users.class).getResultList();
	}

}
