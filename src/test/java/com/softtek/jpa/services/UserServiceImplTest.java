package com.softtek.jpa.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.softtek.jpa.domain.User;
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
	
	@InjectMocks
	private User user=new User("Ernesto", "mmurillo", "Ernesto", "1", "1300", "nada");
	
	@Mock
	private UserService userService;
	
	@Test
	public void listUserTest() {
		
		
		System.out.println(userService.userList());
		System.out.println(userService.userList().size());
		Assert.assertNotNull(userService.userList());
	}

	/*
	@Test
	public void getUserBynameTest(){
		Assert.assertNotNull(userService.user("admin"));
	}
	
	@Test
	public void updateTest(){
		Assert.assertTrue(userService.update(new User(), "Adimnistrator"));
	}
	
	 */

}
