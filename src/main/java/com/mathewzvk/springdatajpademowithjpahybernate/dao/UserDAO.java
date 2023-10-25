package com.mathewzvk.springdatajpademowithjpahybernate.dao;

import com.mathewzvk.springdatajpademowithjpahybernate.entity.User;

public interface UserDAO {
	
	public User findByUsername(String theUserName);

}
