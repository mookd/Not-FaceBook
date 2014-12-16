package com.cooksys.front;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginPage() {
		return "index"; 
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String formTest(@RequestParam("username") String username, @RequestParam("password") String password) {
		return "index"; 
	}
	
}
