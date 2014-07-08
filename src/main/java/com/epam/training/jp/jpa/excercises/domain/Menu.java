package com.epam.training.jp.jpa.excercises.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	Date fromDate;
	Date toDate;
	
	@OneToMany(fetch=FetchType.EAGER)
	List<Food> foods;
	
	// methods to compile project
	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getId() {
		return id;
	}
	
	
}
