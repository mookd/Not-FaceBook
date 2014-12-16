package com.cooksys.back.api.impl;

import com.cooksys.api.IAccountModel;
import com.cooksys.model.Account;

public class AccountModel implements IAccountModel {
	
	private Account account;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String urlPicture;
	
	public AccountModel() {
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(Account account) {
		this.username = account.getUsername();
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(Account account) {
		this.username = account.getPassword();
	}
	
	@Override
	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(Account account) {
		this.username = account.getFirstname();
	}

	@Override
	public String getLastName() {
		return lastname;
	}

	public void setLastName(Account account) {
		this.username = account.getLastname();
	}

	@Override
	public String getUrlPicture() {
		return urlPicture;
	}

	public void setUrlPicture(Account account) {
		this.username = account.getUrlPicture();
	}

}
