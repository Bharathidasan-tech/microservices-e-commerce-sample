/**
 * 
 */
package com.bharathi.shopping.customer.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



/**
 * The Class Users.
 * @author bharathidasan
 *
 */
@Entity
@Table(name = "users")
public class Users implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column (name = "username")
	private String username;
	
	@Column (name = "firstName")
	private String firstName;
	
	@Column (name = "lastName")
	private String lastName;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "mobile")
	private BigInteger mobile;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinTable(name="user_x_address", 
		joinColumns=@JoinColumn(name="user_id"),
		inverseJoinColumns=@JoinColumn(name="address_id"))
	 private List<Address> address;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the mobile
	 */
	public BigInteger getMobile() {
		return mobile;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the address
	 */
	public List<Address> getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}

	/**
	 * @param username
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param mobile
	 * @param address
	 */
	public Users(String username, String firstName, String lastName, String email, BigInteger mobile) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
	}
	
	//for bi-directional relationship
	public void addAddress(Address p_address) {
		
		if(address ==null) {
			address = new ArrayList<Address>();
		}
		
		address.add(p_address);
		
	}

	/**
	 * 
	 */
	public Users() {
	}

}
