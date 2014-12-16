package com.cooksys.front;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cooksys.back.dao.IAccountDAO;
import com.cooksys.back.dao.IPostDAO;

/**
 * 
 * @author Bondstone70
 *
 */
@Controller
@Scope("singleton")
public class ProfileController {
	
	@Autowired
	private IPostDAO postDao;
	
	@Autowired
	private IAccountDAO accountDao;
	
	@Autowired
	private WallBean wallBean;
	
	@PostConstruct
	public void init() {
			
	}
	
}
