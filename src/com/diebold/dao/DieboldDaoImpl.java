package com.diebold.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.diebold.model.DieboldModel;

@Repository
public class DieboldDaoImpl implements DieboldDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	public void add(DieboldModel dm) {
		System.out.println("DieboldDaoImpl.add()");
		sessionFactory.getCurrentSession().save(dm);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<DieboldModel> getAllList() {
		System.out.println("DieboldDaoImpl.getAllList()");
		return (List<DieboldModel>) sessionFactory.getCurrentSession().createCriteria(DieboldModel.class).list();
	}
	
}
