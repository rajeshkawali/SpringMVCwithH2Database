package com.diebold.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diebold.dao.DieboldDao;
import com.diebold.model.DieboldModel;

@Service
@Transactional
public class DieboldServiceImpl implements DieboldService {

	@Autowired
	private DieboldDao dieboldDao;
	
	public void add(DieboldModel dm) {
		dieboldDao.add(dm);
	}


	public List<DieboldModel> getAllList() {
        return dieboldDao.getAllList();
	}

}
