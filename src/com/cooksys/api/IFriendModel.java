package com.cooksys.api;

import java.util.Date;

public interface IFriendModel {

	public Date getDateCreated();
	
	/**
	 * Requires: 0<=status<=2
	 * @param status
	 */
	public void setStatus(int status);
	
	public void getStatus();
	
	public IAccountModel getFrienderAccountModel();
	
	public IAccountModel getFriendeeAccountMode();
	
	
	
	
}
