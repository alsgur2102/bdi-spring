package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bdi.sp.dao.DelDAO;
import com.bdi.sp.service.DelService;
import com.bdi.sp.vo.Del;

public class DelServiceImpl implements DelService {

	@Autowired
	private DelDAO dao;
	
	@Override
	public List<Del> getDelList(Del d) {
		return dao.getDelList(d); 
	}

	@Override
	public Del getDel(int num) {
		return dao.getDel(num);
	}

	@Override
	public int insertDel(Del d) {
		return dao.insertDel(d);
	}

	@Override
	public int updateDel(Del d) {
		return dao.updateDel(d);
	}

	@Override
	public int deleteDel(int d) {
		return dao.deleteDel(d);
	}

}
