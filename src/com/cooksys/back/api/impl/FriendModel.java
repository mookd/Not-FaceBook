package com.cooksys.back.api.impl;

import java.util.Date;

import com.cooksys.api.IAccountModel;
import com.cooksys.api.IFriendModel;
import com.cooksys.model.Friend;

public class FriendModel implements IFriendModel {

	private Friend friend;
	private Integer status;
	private Date createdDate;
	private Date updatedDate;
	
	
	@Override
	public void setStatus(int status) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer getStatus() {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public IAccountModel getFrienderAccountModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAccountModel getFriendeeAccountModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getCreatedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getUpdatedDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
