package com.mathewzvk.springdatajpademowithjpahybernate.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mathewzvk.springdatajpademowithjpahybernate.entity.User;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);
}
