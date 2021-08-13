package com.springrest.springrest.services;

import com.springrest.springrest.entities.User;

public interface IUserServices {
	 public User getUser(String username, String password);
}
