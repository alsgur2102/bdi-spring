package com.bdi.sp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.service.DepartInfoService;
import com.bdi.sp.vo.DepartInfo;

@Controller
public class DepartInfoController {
	
	@Autowired
	private DepartInfoService dis;
	
	@RequestMapping(value="/departinfos", method=RequestMethod.GET)
	public @ResponseBody List<DepartInfo> departList(@ModelAttribute DepartInfo di) {
		return dis.getDepartInfoList(di);
	}
	
	@RequestMapping(value="/departinfos/{diNo}", method=RequestMethod.GET)
	public @ResponseBody DepartInfo departinfoList(@PathVariable Integer diNo) {
		return dis.getDepartInfo(diNo);
	}
}
