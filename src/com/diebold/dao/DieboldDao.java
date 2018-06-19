package com.diebold.dao;

import java.util.List;

import com.diebold.model.DieboldModel;

public interface DieboldDao {

	public void add(DieboldModel dm);
	public List<DieboldModel> getAllList();
}
