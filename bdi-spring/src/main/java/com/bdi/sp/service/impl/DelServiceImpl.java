package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.DelDAO;
import com.bdi.sp.service.DelService;
import com.bdi.sp.vo.Del;

@Service
public class DelServiceImpl implements DelService {

	@Autowired
	private DelDAO ddao;
	
	@Override
	public List<Del> getDelList(Del d) {
		return ddao.getDelList(d); 
	}

	@Override
	public Del getDel(int num) {
		return ddao.getDel(num);
	}

	@Override
	public int insertDel(Del d) {
		return ddao.insertDel(d);
	}

	@Override
	public int updateDel(Del d) {
		return ddao.updateDel(d);
	}

	@Override
	public int deleteDel(int d) {
		return ddao.deleteDel(d);
	}

}
