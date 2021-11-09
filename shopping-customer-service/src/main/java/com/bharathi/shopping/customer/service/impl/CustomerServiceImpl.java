package com.bharathi.shopping.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharathi.shopping.customer.dao.CustomerDao;
import com.bharathi.shopping.customer.entity.Users;
import com.bharathi.shopping.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;



	@Override
	public List<Users> findAll() {
		return  customerDao.findAll();
	}

	
	

}
