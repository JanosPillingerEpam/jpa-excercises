package com.epam.training.jp.jpa.excercises.dao.jpaimpl;

import java.util.Date;
import java.util.List;

import com.epam.training.jp.jpa.excercises.dao.MenuDao;
import com.epam.training.jp.jpa.excercises.domain.Food;
import com.epam.training.jp.jpa.excercises.domain.Menu;

public class JpaMenuDao extends GenericJpaDao implements MenuDao {

	@Override
	public List<Menu> getActualMenus() {
		String query = "SELECT m FROM Menu m "
				+ "WHERE :curDate BETWEEN m.fromDate AND m.toDate";
		return entityManager.createQuery(query,Menu.class)
				.setParameter("curDate", new Date()).getResultList();
	}

	@Override
	public Food findFoodById(int foodId) {
		String query = "SELECT f FROM Food f "
				+ "WHERE f.id = :foodId";
		return entityManager.createQuery(query, Food.class)
				.setParameter("foodId", foodId).getSingleResult();
	}

}
