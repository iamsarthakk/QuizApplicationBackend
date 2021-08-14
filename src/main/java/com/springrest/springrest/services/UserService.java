package com.springrest.springrest.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.User;

@Service
public class UserService implements IUserServices {
	ArrayList<User> users = new ArrayList<User>();
	
	@Override
	public User getUser(String username, String password) {
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getUsername()==username && users.get(i).getPassword()==password) {
				return users.get(i);
			}
		}
		System.out.println("User Not Found");
		
		return null;
	}

	@Override
	public User addUser(User user) {
		users.add(user);
		return user;
	}

	@Override
	public ArrayList<User> getUsers() {
		
		return users;
	}

}
