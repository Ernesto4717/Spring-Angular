package com.softtek.jpa.services;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.softtek.jpa.domain.User;
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {

	private UserService userService=new UserService() {
		
		@Override
		public List<User> userList() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public User user(String username) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean update(User user, String user_role_id) {
			// TODO Auto-generated method stub
			return false;
		}
	};
	
	@Test
	public void listUserTest() {
		Assert.assertNotNull(userService.userList());
	}
	
	@Test
	public void getUserBynameTest(){
		Assert.assertNotNull(userService.user("admin"));
	}
	
	/*
	@Test
	public void updateTest(){
		Assert.assertTrue(userService.update(new User(), "Adimnistrator"));
	}
	
	 */

}
