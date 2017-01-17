package com.softtek.jpa.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations={"classpath:spring/application-context.xml"} )
public class UserServiceImplIt {

	@Autowired
	private UserService userService;
	
	@Test
	public void testFindAllUsers(){
	/*	List<UserEntity> users = userService.findUsers();
	System.out.println(users);
		Assert.assertNotNull(users);	
		*/
	
	}
	
	
}
