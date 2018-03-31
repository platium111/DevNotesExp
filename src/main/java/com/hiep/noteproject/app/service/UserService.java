package com.hiep.noteproject.app.service;

import com.hiep.noteproject.app.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}