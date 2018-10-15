package com.bdi.sp.service;

import java.util.List;

import com.bdi.sp.vo.DepartInfo;

public interface DepartInfoService {

	public List<DepartInfo> getDepartInfoList(DepartInfo di);
	public DepartInfo getDepartInfo(int diNo);
}
