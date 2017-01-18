package com.softtek.jpa.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.softtek.jpa.domain.User;
@RunWith(SpringJUnit4ClassRunner.class)
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
		Assert.assertTrue(userService.update(new User(), "Adimnistrator"));
	}
	


}
