package com.cooksys.back.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cooksys.api.IAccountModel;
import com.cooksys.api.IFriendModel;
import com.cooksys.back.dao.IFriendDAO;
import com.cooksys.model.Account;
import com.cooksys.model.Friend;

@Repository
@Scope("singleton")
@Transactional
public class FriendDAOImpl implements IFriendDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public FriendDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<IFriendModel> getFriendList(IAccountModel account) {
		List<IFriendModel> friendList = new ArrayList<IFriendModel>();
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT f from Friend a WHERE Friend.accountByFrienderId.accountId = "
				+ account.getAccountId()
				+ " or Friend.accountByFriendeeId.accountId = "
				+ account.getAccountId();
		Query query = session.createQuery(hql);

		for (Object obj : query.list()) {
			IFriendModel friendModel = (IFriendModel) obj;

			Hibernate.initialize(friendModel.getCreatedDate());
			Hibernate.initialize(friendModel.getUpdatedDate());

			Hibernate.initialize(friendModel.getFrienderAccountModel()
					.getAccountId());
			Hibernate.initialize(friendModel.getFrienderAccountModel()
					.getFirstName());
			Hibernate.initialize(friendModel.getFrienderAccountModel()
					.getLastName());
			Hibernate.initialize(friendModel.getFrienderAccountModel()
					.getPassword());
			Hibernate.initialize(friendModel.getFrienderAccountModel()
					.getUrlPicture());
			Hibernate.initialize(friendModel.getFrienderAccountModel()
					.getUsername());

			Hibernate.initialize(friendModel.getFriendeeAccountModel()
					.getAccountId());
			Hibernate.initialize(friendModel.getFriendeeAccountModel()
					.getFirstName());
			Hibernate.initialize(friendModel.getFriendeeAccountModel()
					.getLastName());
			Hibernate.initialize(friendModel.getFriendeeAccountModel()
					.getPassword());
			Hibernate.initialize(friendModel.getFriendeeAccountModel()
					.getUrlPicture());
			Hibernate.initialize(friendModel.getFriendeeAccountModel()
					.getUsername());

			Hibernate.initialize(friendModel.getStatus());

			friendList.add(friendModel);
		}

		return friendList;
	}

	@Override
	public void commitFriendByModel(IAccountModel frienderAccount,
			IAccountModel friendeeAccount) {
		Session session = sessionFactory.getCurrentSession();
		Friend friend = new Friend();
		friend.setAccountByFrienderId((Account) frienderAccount);
		friend.setAccountByFriendeeId((Account) friendeeAccount);
		friend.setCreatedDate(new Date());
		friend.setUpdatedDate(new Date());
		friend.setStatus(0);

		session.save(friend);
	}

	@Override
	public void updateFriendByModel(IAccountModel frienderAccount,
			IAccountModel friendeeAccount, Integer status) {
		Session session = sessionFactory.getCurrentSession();
		Friend friend = new Friend();
		String hql = "SELECT f from Friend where accountByFrienderId.accountId = " + frienderAccount.getAccountId()
				+ " and accountByFriendeeId.aaccountByFrienderIdccountId = " + friendeeAccount.getAccountId();
				
		Query query = session.createQuery(hql);
		friend = (Friend) query.uniqueResult();
		
		friend.setStatus(status);
		friend.setUpdatedDate(new Date());
		session.update(friend);
	}
}
