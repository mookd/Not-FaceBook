package com.cooksys.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.cooksys.dao.impl.AccountDAOImpl;
import com.cooksys.interfaces.IAccountModel;

@Component
@Scope("singleton")
public class BCryptBean {

	@Autowired
	private IAccountModel account; 
	
	@Autowired
	private LoginBean loginBean; 
	
	private String username; 
	private String password; 
	private String hashedPassword;
	
	BCryptPasswordEncoder encoder; 
	
	public String EncryptPassword() {
		setPassword(loginBean.getPassword());	
		hashedPassword = encoder.encode(password); 
		return hashedPassword; 
	}
	
	public void CheckPassword() {

	}
	
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
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	} 
	
}
