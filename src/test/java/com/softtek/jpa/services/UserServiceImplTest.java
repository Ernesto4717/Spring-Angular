package com.softtek.jpa.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.softtek.jpa.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/application-context.xml")
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
		User user= new User("ernes", "mmurillo", "Ernesto", "admin", "active", "description");
		boolean state= userService.update(user, "Admin");
		Assert.assertTrue(state);
	}

}
