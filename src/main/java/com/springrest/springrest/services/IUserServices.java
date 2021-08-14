package com.springrest.springrest.services;

import java.util.ArrayList;

import com.springrest.springrest.entities.User;

public interface IUserServices {
	 public User getUser(String username, String password);
	 public User addUser(User user);
	 public ArrayList<User> getUsers();
}
