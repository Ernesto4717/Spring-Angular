package com.softtek.jpa.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.softtek.jpa.domain.Cart;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(inheritLocations=true)
@DatabaseSetup(value = {"/dataset/cart/Default.xml" },  type = DatabaseOperation.CLEAN_INSERT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class CartServiceImplIT {

	private static final Logger logger = LoggerFactory.getLogger(CartServiceImplIT.class);
	
	@Autowired
	CartService cartService;
	
	@Test
	@ExpectedDatabase("/dataset/cart/Expect.xml")
	public void shouldTrueWhenCartListIsCorrect(){
		cartService.cartList();
	}

	@Test
	public void shouldTrueWhenUpdateIsCorrect(){
		Cart cart = cartService.cart(1l);
		cart.getCartDetails().setCartAmount(2345.23);
		System.out.println("cart: " + cart);
		Assert.assertTrue(cartService.update(cart));
		
	}
	
}
