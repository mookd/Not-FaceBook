package com.cooksys.back.dao;

import java.util.List;

import com.cooksys.api.IPostModel;
import com.cooksys.model.Post;

public interface IPostDAO {

	public Post getPostByModel(IPostModel post);
	
	public Post commitPostByModel(IPostModel post);
	
	public List<IPostModel> getAllPosts();
	
	public void commitPosts(IPostModel postModel);
	
}
