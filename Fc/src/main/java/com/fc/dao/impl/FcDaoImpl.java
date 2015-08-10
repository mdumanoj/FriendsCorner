package com.fc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fc.dao.FcDao;
import com.fc.model.User;

@Repository
public class FcDaoImpl implements FcDao {

	
	private EntityManager entityManager;

	@PersistenceContext(unitName = "fcApp")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public User getUserDetails(User user) {
		int id = user.getUser_id();
		//List list = entityManager.createQuery("select u from User u").getResultList();
		User emp1 = entityManager.find(User.class, id);
	    
		return emp1;
	}

	public User getFofDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllUserDetails() {
		List<User> list= new ArrayList<User>();
		Query query = entityManager.createQuery("select user_name from User");
		list = query.getResultList();
		return list;
	}
}
