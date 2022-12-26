package com.inn.cafe.service.impl;

import java.time.LocalTime;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inn.cafe.model.User;
import com.inn.cafe.repository.UserRepository;
import com.inn.cafe.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepository userRepository;
	@Override
	public User crateUser(User user) throws Exception {
		User local = this.userRepository.findByEmail(user.getemail());
		if(local!=null){
            System.out.println("User is already exist!!");
            throw new Exception("User already created!!");
        }
        else{
            local = this.userRepository.save(user);
        }
        return local;
	}
	
	@Override
	public User login_user(String password, String email) throws Exception {
		User local = userRepository.findByPasswordAndEmail(password,email);
		if(local==null) {
			System.out.println("Invalid Username or Password in UserServiceImpl");
			throw new Exception ("Invalid Username or Password in UserServiceImpl ");
		}
		else {
			return local;
		}
	}

	@Override
	public String update_login_time(User user) throws Exception {
		LocalTime time = LocalTime.
        		of(LocalTime.now().getHour(), 
        				LocalTime.now().getMinute(), 
        				LocalTime.now().getSecond());
		user.setLogin_timein(time.toString());
		User save_user = userRepository.save(user);
		if(save_user==null) {
			System.out.println("User Login Time Not Updated");
			throw new Exception("User Login Time Not Updated");
		}
		else {
			return "Login Time Updated.";			
		}
	}

	@Override
	public User getUser(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public Set<User> getAllUsers() {
		Set<User> users = userRepository.getUsers();
		return users;
	}

	@Override
	public String update_logout_time(User user) throws Exception {
		LocalTime time = LocalTime.
        		of(LocalTime.now().getHour(), 
        				LocalTime.now().getMinute(), 
        				LocalTime.now().getSecond());
		user.setLogin_timeout(time.toString());
		User save_user = userRepository.save(user);
		if(save_user==null) {
			System.out.println("User Login Time Not Updated");
			throw new Exception("User Login Time Not Updated");
		}
		else {
			return "Login Time Updated.";			
		}
	}
	
	
	
	

}
