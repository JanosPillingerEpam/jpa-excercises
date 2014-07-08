package com.epam.training.jp.jpa.excercises.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue
	int id;
	String name;
	
	@OneToMany
	List<Menu> menus;
	
	@OneToOne
	Address address;

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public List<Menu> getMenus() {
		return menus;
	}
	
	
}
