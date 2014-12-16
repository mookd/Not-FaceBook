package com.cooksys.dao.impl;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cooksys.back.dao.IAccountDAO;
import com.cooksys.back.impl.AccountModel;
import com.cooksys.interfaces.IAccountModel;
import com.cooksys.model.Account;

@Repository
@Scope("singleton")
@Transactional
public class AccountDAOImpl implements IAccountDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public AccountDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		System.out.println("AccountDAOImpl Initialized");
	}
	
	@Override
	public IAccountModel getAccountByModel(IAccountModel account) {
		IAccountModel acc = new AccountModel();
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT a from Account a WHERE Account.username = "+ account.getUsername();
		Query query = session.createQuery(hql);
		acc = (AccountModel) query.uniqueResult();
		return acc;
	}

	@Override
	public void commitAccountByModel(IAccountModel account) {
		Account acc = new Account();
		acc.setUsername(account.getUsername());
		acc.setFirstname(account.getFirstName());
		acc.setLastname(account.getLastName());
		acc.setPassword(account.getPassword());
		acc.setUrlPicture(account.getUrlPicture());
		
		Session session = sessionFactory.getCurrentSession();
		session.save(acc);
	}

}
