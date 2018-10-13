package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.bdi.sp.dao.DelDAO;
import com.bdi.sp.vo.Del;

public class DelDAOImpl implements DelDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Del> getDelList(Del d) {
		return ss.selectList("om.bdi.sp.DelMapper.selectDelList", d); 
	}

	@Override
	public Del getDel(int num) {
		return ss.selectOne("com.bdi.sp.DelMapper.selectDel", num);
	}

	@Override
	public int insertDel(Del d) {
		return ss.insert("com.bdi.sp.DelMapper.insertDel", d);
	}

	@Override
	public int updateDel(Del d) {
		return ss.update("com.bdi.sp.DelMapper.updateDel", d);
	}

	@Override
	public int deleteDel(int d) {
		return ss.delete("com.bdi.sp.DelMapper.deleteDel", d);
	}

}
