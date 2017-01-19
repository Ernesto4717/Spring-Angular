package com.softtek.jpa.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(inheritLocations=true)
@DatabaseSetup(value = {"/dataset/default.xml" },  type = DatabaseOperation.CLEAN_INSERT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class CartServiceImplIT {
	
	@Autowired
	CartService cartService;
	
	@Test
	@DatabaseSetup(value="/dataset/cartDefault.xml",  type=DatabaseOperation.INSERT)
	public void shouldTrueWhenCartListIsCorrect(){
		int registerNum= cartService.cartList().size();
		System.out.println(cartService.cartList());
		Assert.assertTrue(registerNum==1);
	}
	
}
