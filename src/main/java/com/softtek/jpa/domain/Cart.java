package com.softtek.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
@NamedNativeQueries({
	@NamedNativeQuery(
			name="findCarts",
			query="SELECT c.cart_id as cart_key, "
					+ "c.lines_amount as linesAmount, "
					+ "c.shipping_amount as shippingAmount, "
					+ "c.cart_amount as cartAmount, "
					+ "st.name as ship_to, "
					+ "c.ship_to_id as shipToId, "
					+ "s.description as status, "
					+ "c.status_id as statusId, " 
					+ "c.create_date as createdate, "
					+ "c.update_date as updatedate "
					+" FROM cart c "
			+ " JOIN ship_to st ON st.ship_to_id = c.ship_to_id "
			+ " JOIN status s ON s.status_id = c.status_id ",
			resultSetMapping = "CartsMapping"),
	@NamedNativeQuery(
			name="findOneCart",
			query="SELECT c.cart_id as cart_key, "
					+ "c.lines_amount as linesAmount, "
					+ "c.shipping_amount as shippingAmount, "
					+ "c.cart_amount as cartAmount, "
					+ "st.name as ship_to, "
					+ "c.ship_to_id as shipToId, "
					+ "s.description as status, "
					+ "c.status_id as statusId,"
					+ "c.create_date as createdate, "
					+ "c.update_date as updatedate "
					
					+" FROM cart c "
			+ " JOIN ship_to st ON st.ship_to_id = c.ship_to_id "
			+ " JOIN status s ON s.status_id = c.status_id "
			+ "WHERE c.cart_id = :cartId ",
			resultSetMapping = "CartsMapping")
	})
@SqlResultSetMappings({
	@SqlResultSetMapping(name="CartsMapping",
			classes= {
					@ConstructorResult(
							targetClass = Cart.class,
							columns = {
								@ColumnResult(name = "cart_key", type = Long.class),
								@ColumnResult(name = "linesAmount", type = Double.class),
								@ColumnResult(name = "shippingAmount", type = Double.class),
								@ColumnResult(name = "cartAmount", type = Double.class),
								@ColumnResult(name = "ship_to", type= String.class),
								@ColumnResult(name = "shipToId", type= Long.class),
								@ColumnResult(name = "status", type = String.class),
								@ColumnResult(name = "statusId", type= Long.class),
								@ColumnResult(name = "createdate", type= Date.class),
								@ColumnResult(name = "updatedate", type= Date.class)
							})
			})
})

public class Cart implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CartKey id;

	@Embedded
	private CartDetails cartDetails;

	@Embedded
	private Audit audit;
	
	public Cart() {
		super();
	}

	
	
	public Cart(final Long cart_key,final Double linesAmount,final Double shippingAmount,final Double cartAmount,
			final String ship_to, final Long shipToId,final String status,final Long statusId,final Date date,final Date update) {
		super();
		this.id=new CartKey(cart_key);
		this.cartDetails=new CartDetails(linesAmount, shippingAmount, cartAmount, shipToId,ship_to, statusId,status);
		this.audit=new Audit(date, update);
	}
	public Cart(final Long cart_key,final Double linesAmount,final Double shippingAmount,final Double cartAmount,
			final Long ship_to_id,final Long status_id) {
		super();
		this.id=new CartKey(cart_key);
		this.cartDetails=new CartDetails(linesAmount, shippingAmount, cartAmount, ship_to_id,"", status_id,"");

	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((audit == null) ? 0 : audit.hashCode());
		result = prime * result + ((cartDetails == null) ? 0 : cartDetails.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (audit == null) {
			if (other.audit != null)
				return false;
		} else if (!audit.equals(other.audit))
			return false;
		if (cartDetails == null) {
			if (other.cartDetails != null)
				return false;
		} else if (!cartDetails.equals(other.cartDetails))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public CartKey getId() {
		return id;
	}

	public void setId(CartKey id) {
		this.id = id;
	}

	public CartDetails getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(CartDetails cartDetails) {
		this.cartDetails = cartDetails;
	}

	public Audit getAudit() {
		return audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}
	
	
	
	
	 	

	
}
