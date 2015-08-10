package com.fc.service;

import java.util.List;

import com.fc.model.User;

public interface FcService {

	User getUserDetails(User user);

	User getFofDetails(User user);

	List<User> getAllUserDetails();

}
