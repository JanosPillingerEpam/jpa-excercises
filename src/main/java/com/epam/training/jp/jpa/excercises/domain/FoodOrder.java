package com.epam.training.jp.jpa.excercises.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class FoodOrder {
	
	@Id
	@GeneratedValue
	int id;
	String customer;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	Address deliveryAddress;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	List<OrderItem> orderItems;
	
	@Enumerated(EnumType.STRING)
	OrderState state;

	public FoodOrder(List<OrderItem> createOrderItems, Address address, String customer, OrderState pending) {
		this.orderItems = createOrderItems;
		this.deliveryAddress = address;
		this.customer = customer;
		this.state = pending;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	public int getId() {
		return id;
	}


	

}
