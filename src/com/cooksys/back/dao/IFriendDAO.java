package com.cooksys.back.dao;


import com.cooksys.api.IFriendModel;
import com.cooksys.model.Friend;

public interface IFriendDAO {

	public Friend getFriendByModel(IFriendModel friend);
	
	public Friend commitFriendByModel(IFriendModel friend);
	
}
