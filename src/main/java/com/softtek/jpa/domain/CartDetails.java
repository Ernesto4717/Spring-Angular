package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Embeddable
public class CartDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "lines_amount")
	private Double linesAmount;
	
	@Column(name = "shipping_amount")
	private Double shippingAmount;
	
	@Column(name = "cart_amount")
	private Double cartAmount;
	
	@ManyToOne
	@JoinColumn(name = "ship_to_id")
	private ShipTo shipTo;
	
	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status status;
	
	public CartDetails(){
		
	}
	
	
	public CartDetails(Double linesAmount, Double shippingAmount, Double cartAmount, Long id,String name, Long status, String description) {
		super();
		this.linesAmount = linesAmount;
		this.shippingAmount = shippingAmount;
		this.cartAmount = cartAmount;
		this.shipTo=new ShipTo(id, name);
		this.status=new Status(status,description);
	}
	
	@Override
	public String toString() {
		return "CartDetails [linesAmount=" + linesAmount + ", shippingAmount=" + shippingAmount + ", cartAmount="
				+ cartAmount + ", shipTo=" + shipTo + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartAmount == null) ? 0 : cartAmount.hashCode());
		result = prime * result + ((linesAmount == null) ? 0 : linesAmount.hashCode());
		result = prime * result + ((shipTo == null) ? 0 : shipTo.hashCode());
		result = prime * result + ((shippingAmount == null) ? 0 : shippingAmount.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		CartDetails other = (CartDetails) obj;
		if (cartAmount == null) {
			if (other.cartAmount != null)
				return false;
		} else if (!cartAmount.equals(other.cartAmount))
			return false;
		if (linesAmount == null) {
			if (other.linesAmount != null)
				return false;
		} else if (!linesAmount.equals(other.linesAmount))
			return false;
		if (shipTo == null) {
			if (other.shipTo != null)
				return false;
		} else if (!shipTo.equals(other.shipTo))
			return false;
		if (shippingAmount == null) {
			if (other.shippingAmount != null)
				return false;
		} else if (!shippingAmount.equals(other.shippingAmount))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	public Double getLinesAmount() {
		return linesAmount;
	}

	public void setLinesAmount(Double linesAmount) {
		this.linesAmount = linesAmount;
	}

	public Double getShippingAmount() {
		return shippingAmount;
	}

	public void setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	public Double getCartAmount() {
		return cartAmount;
	}

	public void setCartAmount(Double cartAmount) {
		this.cartAmount = cartAmount;
	}

	public ShipTo getShipTo() {
		return shipTo;
	}

	public void setShipTo(ShipTo shipTo) {
		this.shipTo = shipTo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


	
	
	

}
