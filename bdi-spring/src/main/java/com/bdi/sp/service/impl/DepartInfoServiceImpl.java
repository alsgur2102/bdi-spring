package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.DepartInfoDAO;
import com.bdi.sp.service.DepartInfoService;
import com.bdi.sp.vo.DepartInfo;

@Service
public class DepartInfoServiceImpl implements DepartInfoService {

	@Autowired
	private DepartInfoDAO didao;
	
	@Override
	public List<DepartInfo> getDepartInfoList(DepartInfo di) {
		return didao.getDepartInfoList(di);
	}

	@Override
	public DepartInfo getDepartInfo(int diNo) {
		return didao.getDepartInfo(diNo);
	}

}
