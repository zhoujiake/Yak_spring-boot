package com.example.yak.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.yak.domain.model.User;

@Controller
public class Login {

	    @RequestMapping("/getUser")
	    public User getUser() {
	    	User user=new User();
	    	user.setUserName("C");
	    	user.setPassWord("xxxx");
	        return user;
	    }
}


















