package com.softtek.jpa.services;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.jpa.domain.User;

public class UserServiceImplTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void listUserTest() {
		Assert.assertNotNull(userService.userList());
	}
	
	@Test
	public void getUserBynameTest(){
		Assert.assertNotNull(userService.user("admin"));
	}
	
	@Test
	public void updateTest(){
		boolean state= userService.update(new User(), "Adimnistrator");
		Assert.assertTrue(state);
	}

}
