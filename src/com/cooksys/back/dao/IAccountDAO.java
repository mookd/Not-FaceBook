package com.cooksys.back.dao;

import com.cooksys.api.IAccountModel;

public interface IAccountDAO {
	
	public IAccountModel getAccountByModel(IAccountModel account);
	
	public void commitAccountByModel(IAccountModel account);

}
