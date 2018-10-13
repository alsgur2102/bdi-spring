package com.bdi.sp.service;

import java.util.List;

import com.bdi.sp.vo.Del;

public interface DelService {

	public List<Del> getDelList(Del d);
	
	public Del getDel(int num);
	
	public int insertDel(Del d);
	
	public int updateDel(Del d);
	
	public int deleteDel(int d);
	
}
