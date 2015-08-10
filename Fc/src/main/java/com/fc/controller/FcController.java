package com.fc.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fc.model.User;
import com.fc.service.FcService;

@RestController
@RequestMapping("/user")
public class FcController {

	@Autowired
	private FcService fcService;
	
	@RequestMapping("/")
	public String sample(){
		return "Enter into Friend List";
	}
	
	@RequestMapping(value="/userDetails" , method = RequestMethod.PUT )
	public @ResponseBody User getUserDetail(@RequestBody User user){
		User list = new User();
		list = fcService.getUserDetails(user);
		return list;
		
	}
	
	@RequestMapping(value="/fof" , method = RequestMethod.PUT )
	public @ResponseBody User getFofList(@RequestBody User user){
		System.out.println("TESTING ...");
		System.out.println(user.getUser_email());
		fcService.getFofDetails(user);
		return user;
		
	}
	@RequestMapping(value="/alluser" , method = RequestMethod.PUT )
	public @ResponseBody List getAllUserDetail(@RequestBody User user){
		List<User> list = new ArrayList<User>();
		System.out.println("TESTING ...");
		System.out.println(user.getUser_email());
		if(user.getUser_email() != null)
		list = fcService.getAllUserDetails();
		
		return list;
		
	}
}
