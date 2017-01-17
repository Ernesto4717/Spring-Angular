package com.softtek.jpa.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.Cart;
import com.softtek.jpa.domain.CartKey;

@Repository
public interface CartRepository extends JpaRepository<Cart, CartKey>{

	@Query(name = "findCarts", nativeQuery = true)
	public List<Cart> cartList();
	
	@Query(name = "findOneCart", nativeQuery = true)
	public Cart cart(@Param ("cartId") Long cart_id);
	
	
}
