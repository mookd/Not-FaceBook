package com.cooksys.back.dao;


import java.util.List;

import com.cooksys.api.IAccountModel;
import com.cooksys.api.IFriendModel;

public interface IFriendDAO {

	public List<IFriendModel> getFriendList(IAccountModel account);
	
	public void commitFriendByModel(IAccountModel frienderAccount, IAccountModel friendeeAccount);
	
	public void updateFriendByModel(IAccountModel frienderAccount, IAccountModel friendeeAccount, Integer status);
}
