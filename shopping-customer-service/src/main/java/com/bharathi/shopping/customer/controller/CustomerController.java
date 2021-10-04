
package com.bharathi.shopping.customer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author bharathidasan
 *
 */
@RestController
@RequestMapping(value="/v1/")
public class CustomerController {
	
	@RequestMapping(value="customer/test")
	public ResponseEntity<Object> testAPI(){
		
		Map<String, String> obj=new HashMap<String, String>();
		
		obj.put("123", "Bharathidasan");
		obj.put("124", "Aadhira Bharathidasan");
		obj.put("125", "John");
		
		return new ResponseEntity<Object>(obj,HttpStatus.OK);
	}

}
