package com.cooksys.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

import com.cooksys.api.IAccountModel;
import com.cooksys.back.dao.IAccountDAO;
import com.cooksys.model.Account;

@Component
@Scope("view")
public class LoginBean {

	private String username;
	private String password;
	private Account account; 

	private static Boolean isLoggedIn = false; //use this to set boolean in authbean later
	
	@Autowired
	IAccountDAO accountDao; 
	
	@Autowired
	IAccountModel accountModel; 
	
	@Autowired
	private UserAuthBean authBean;
		
	public void doAuthentication(){
//		hibernateBean = new HibernateBean();
//		Account a = hibernateBean.getUserByUsername(username);
//		account credentials here to simulate pulled hibernate objects
//		justin.setUsername("jeplmr");
//		justin.setPassword("$2a$10$UYYJRk.DRXqcOtfg0YATpO4nwsyP4VjC4AYR4YDnNYMg02liOSMQy");
//		System.out.println("hibernate username = " + justin.getUsername());
//		System.out.println("hibernate password = " + justin.getPassword());
		
//		account credentials here to simulate entered form data
//		setUsername("jeplmr");
//		setPassword("iddqd");
//		System.out.println("inputed username = " + username);
//		System.out.println("inputed password = " + password);
//
//		if(BCrypt.checkpw(password, justin.getPassword())){
//			authBean.setAuthenticated(true);
//			isLoggedIn = true;
//			System.out.println("login successful");
//			System.out.println("isLoggedIn = true");
//			//return "profile";
//		}else{
//			//return "LOG IN FAILED";
//			System.out.println("login failed");
//		}
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

	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public IAccountDAO getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(IAccountDAO accountDao) {
		this.accountDao = accountDao;
	}

	public IAccountModel getAccountModel() {
		return accountModel;
	}

	public void setAccountModel(IAccountModel accountModel) {
		this.accountModel = accountModel;
	}
	
}
