/**
 * 
 */
package com.bharathi.shopping.customer.dao;

import java.util.List;

import com.bharathi.shopping.customer.entity.Users;

/**
 * @author bharathidasan
 *
 */
public interface CustomerDao {

	/**
	 * @return
	 */
	public List<Users> findAll();
	


}
