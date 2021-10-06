package com.bharathi.shopping.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bharathi.shopping.customer.dao.CustomerDao;
import com.bharathi.shopping.customer.entity.User;
import com.bharathi.shopping.customer.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;



	@Override
	public List<User> findAll() {
		return  customerDao.findAll();
	}

	
	

}
