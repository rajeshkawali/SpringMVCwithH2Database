package com.diebold.services;

import java.util.List;

import com.diebold.model.DieboldModel;

public interface DieboldService {

	public void add(DieboldModel dm);
	public List<DieboldModel> getAllList();
}
