package com.mathewzvk.springdatajpademowithjpahybernate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mathewzvk.springdatajpademowithjpahybernate.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class UserDaoImpl implements UserDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public UserDaoImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}

	@Override
	public User findByUsername(String theUserName) {
		// TODO Auto-generated method stub
		TypedQuery<User> theQuery = entityManager.createQuery("from User where userName =:uName", User.class);
		theQuery.setParameter("uName", theUserName);
		
		User theUser = null;
		
		try {
			theUser = theQuery.getSingleResult();
		}catch (Exception e) {
			// TODO: handle exception
			theUser = null;
		}
		return theUser;
	}

}
