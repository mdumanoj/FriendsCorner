package com.fc.dao;

import java.util.List;

import com.fc.model.User;

public interface FcDao {

	User getUserDetails(User user);

	User getFofDetails(User user);

	List<User> getAllUserDetails();

}
