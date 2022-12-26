package com.inn.cafe.service;

import java.util.Set;

import com.inn.cafe.model.User;

public interface UserService {
	public User crateUser(User user) throws Exception;
	public User login_user(String password, String email) throws Exception;
	public String update_login_time(User user) throws Exception;
	public String update_logout_time(User user) throws Exception;
	public User getUser(String email);
	public Set<User> getAllUsers();
}
