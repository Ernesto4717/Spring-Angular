package com.softtek.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.jpa.domain.Cart;
import com.softtek.jpa.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartRepository;
	
	@Override
	public List<Cart> cartList() {
		// TODO Auto-generated method stub
		return cartRepository.cartList();
	}

	@Override
	public Cart cart(Long cart_id) {
		// TODO Auto-generated method stub
		return cartRepository.cart(cart_id);
	}

	@Override
	public boolean update(Cart cart) {
		// TODO Auto-generated method stub
		if(isValidCart(cart)){
			cartRepository.save(cart);
			return true;
		}
		
		return false;
	}
	private Boolean isValidCart(final Cart cart) {
		

		
		if (cart.getCartDetails()== null) {
			return false;
		}
		if (cart.getId()== null) {
			return false;
		}
		if(cart.getCartDetails().getCartAmount()==null ){
			return false;
		}
		if(cart.getCartDetails().getLinesAmount()==null ){
			return false;
		}
		if(cart.getCartDetails().getShippingAmount()==null ){
			return false;
		}
		if(cart.getCartDetails().getShipTo()==null ){
			return false;
		}
		if(cart.getCartDetails().getStatus()==null ){
			return false;
		}
		if(cart.getCartDetails().getShipTo().getConcat()==null ){
			return false;
		}
		return true;
	}

}
