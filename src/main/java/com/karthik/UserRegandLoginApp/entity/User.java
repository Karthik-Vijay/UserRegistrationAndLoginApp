package com.karthik.UserRegandLoginApp.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;	
import javax.persistence.Table;

@Entity 
@Table(name = "User")
public class User {

	@Id
	@Column(name = "USERNAME", nullable = false)
	private String username;
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	@Column(name = "EMAIL", nullable = false)
	private String email;
	@Column(name = "ADDRESS", nullable = false)
	private String address;
	@Column(name = "PHONENO", nullable = false)
	private String phoneNumber;
//	private List<Update> update;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
    //The default constructor only exists for the sake of JPA. You won’t use it directly, so it is designated as protected
	public User() {
	
	}
    //The other constructor is the one you’ll use to create instances of User to be saved to the database.
	public User(String username, String password, String email, String address, String phoneNumber)
	{
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	@Override
	// toString() will printout the user's properties
	public String toString() {
		return "User [getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getEmail()="
				+ getEmail() + ", getAddress()=" + getAddress() + ", getPhoneNumber()=" + getPhoneNumber() + "]";
	}

}