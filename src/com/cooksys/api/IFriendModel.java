package com.cooksys.api;

import java.util.Date;

public interface IFriendModel {

	/**
	 * Requires: 0<=status<=2
	 * @param status
	 */
	public void setStatus(int status);
	
	public Integer getStatus();
	
	public IAccountModel getFrienderAccountModel();
	
	public IAccountModel getFriendeeAccountModel();

	public Date getCreatedDate();

	public Date getUpdatedDate();

	
	
	
	
}
