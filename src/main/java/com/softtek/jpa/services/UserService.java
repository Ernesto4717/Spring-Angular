package com.softtek.jpa.services;

import java.util.List;

import com.softtek.jpa.domain.User;

public interface UserService {
	
	public List<User> userList();
	public User user(String username);
	public boolean update(User user,String user_role_id);

}
