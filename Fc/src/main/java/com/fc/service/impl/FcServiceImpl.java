package com.fc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.dao.FcDao;
import com.fc.model.User;
import com.fc.service.FcService;

@Service
public class FcServiceImpl implements FcService {

	
	@Autowired
	private FcDao fcDao;

	public User getUserDetails(User user) {
		User list= new User() ;
		list= fcDao.getUserDetails(user);
		return list;
	}

	public User getFofDetails(User user) {
		User list= new User() ;
		list= fcDao.getFofDetails(user);
		return null;
	}

	public List<User> getAllUserDetails() {
		List<User> list= new ArrayList<User>();
		list= fcDao.getAllUserDetails();
		return list;
	}
}
