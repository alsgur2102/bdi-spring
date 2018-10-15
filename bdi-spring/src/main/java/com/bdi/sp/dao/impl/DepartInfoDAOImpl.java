package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.DepartInfoDAO;
import com.bdi.sp.vo.DepartInfo;

@Repository
public class DepartInfoDAOImpl implements DepartInfoDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<DepartInfo> getDepartInfoList(DepartInfo di) {
		return ss.selectList("com.bdi.sp.DepartInfoMapper.selectDepartInfoList",di);
	}

	@Override
	public DepartInfo getDepartInfo(int diNo) {
		return ss.selectOne("com.bdi.sp.DepartInfoMapper.selectDepartInfo", diNo);
	}
}
