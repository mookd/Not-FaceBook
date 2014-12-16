package com.cooksys.front;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cooksys.model.Account;

@Component
@Scope("session")
public class UserAuthBean {

	private Account authenticatedAccount;
	private boolean authenticated = false;
	
	public Account getAuthenticatedAccount() {
		return authenticatedAccount;
	}
	
	public void setAuthenticatedAccount(Account authenticatedAccount) {
		this.authenticatedAccount = authenticatedAccount;
	}
	
	public boolean isAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	
}
