/**
 * 
 */
package com.bharathi.shopping.customer.dao;

import java.util.List;

import com.bharathi.shopping.customer.entity.User;

/**
 * @author bharathidasan
 *
 */
public interface CustomerDao {

	/**
	 * @return
	 */
	public List<User> findAll();
	


}
