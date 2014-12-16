package com.cooksys.back.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cooksys.back.dao.IPostDAO;
import com.cooksys.interfaces.IPostModel;
import com.cooksys.model.Account;
import com.cooksys.model.Post;

@Repository
@Transactional
@Scope("singleton")
public class PostDAOimpl implements IPostDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<IPostModel> getAllPosts() {
		
		List<IPostModel> postList = new ArrayList<>();
		Session session = sessionFactory.getCurrentSession();
		
		String queryString = "from Post p";
		Query query = session.createQuery(queryString);
		
		for (Object obj: query.list()){
			IPostModel postModel = (IPostModel) obj;
			//getting posted by
			Hibernate.initialize(postModel.getPostedBy());
			//getting posted to
			Hibernate.initialize(postModel.getPostedTo());
			//initializing posted date
			Hibernate.initialize(postModel.getPostedDate());
			postList.add(postModel);
			System.out.println("From Post p");
		}
		
		Collections.reverse(postList);		
		return postList;		
	}
	
	
	

	@Override
	public void commitPosts(IPostModel postModel) {
		Session session = sessionFactory.getCurrentSession();
		Post post = new Post();
		Account accountPostedBy = new Account();
		Account accountPostedTo = new Account();
		post.setMessage(postModel.getBody());
		
		/*
		 * Packing data back into the Hibernate Object: "post"
		 * also *hopefully setting the foreign keys for the 
		 * accounts referenced
		 */
		
		accountPostedBy.setAccountId(postModel.getPostedById());
		accountPostedTo.setAccountId(postModel.getPostedToId());
		post.setAccountByPostedFrom(accountPostedBy);
		post.setAccountByPostedTo(accountPostedTo);
		
		session.save(post);
		
	}

	@Override
	public Post getPostByModel(IPostModel post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post commitPostByModel(IPostModel post) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
}
