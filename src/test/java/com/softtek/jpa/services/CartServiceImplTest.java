package com.softtek.jpa.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/application-context.xml")
public class CartServiceImplTest {

	@Autowired
	private CartService cartService;

	@Test
	public void listCartTest() {
		Assert.assertNotNull(cartService.cartList());
	}

	@Test
	public void getCartByIdTest() {
		Assert.assertNotNull(cartService.cart(1l));
	}

}
