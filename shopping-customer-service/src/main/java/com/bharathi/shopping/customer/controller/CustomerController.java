
package com.bharathi.shopping.customer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharathi.shopping.customer.entity.User;
import com.bharathi.shopping.customer.service.CustomerService;


/**
 * @author bharathidasan
 *
 */
@RestController
@RequestMapping(value="/v1/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/test")
	public ResponseEntity<Object> testAPI(){
		
		Map<String, String> obj=new HashMap<String, String>();
		
		obj.put("123", "Bharathidasan");
		obj.put("124", "Aadhira Bharathidasan");
		obj.put("125", "John");
		
		return new ResponseEntity<Object>(obj,HttpStatus.OK);
	}
	
	 @PostMapping(value="/create",headers="Accept=application/json")
	 public Map<String,List<User>> getAllUserDetails(){		
		 
		 List<User> l_listofUser=customerService.findAll();
			Map<String,List<User>> l_map=new HashMap<String,List<User>>();
			l_map.put("users", l_listofUser);
			return l_map;
	   

	 }
	 
	 

}
