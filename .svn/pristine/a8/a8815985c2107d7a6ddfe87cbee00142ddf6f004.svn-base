package com.cooksys.front;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.cooksys.interfaces.IPostModel;


@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class WallBean {
	
	private List<IPostModel> postList;
	
	@PostConstruct
	public void init(){
		postList = new ArrayList<>();
	}

	public List<IPostModel> getPostList() {
		return postList;
	}

	public void setPostList(List<IPostModel> postList) {
		this.postList = postList;
	}
	
	

}
