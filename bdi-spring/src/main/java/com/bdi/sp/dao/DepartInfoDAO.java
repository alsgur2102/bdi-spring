package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.DepartInfo;

public interface DepartInfoDAO {

	public List<DepartInfo> getDepartInfoList(DepartInfo di);
	public DepartInfo getDepartInfo(int diNo);
}
