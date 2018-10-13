package com.bdi.sp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.service.DelService;
import com.bdi.sp.vo.Del;

@Controller
public class DelController {

	private static final Logger logger = LoggerFactory.getLogger(DelController.class);
	
	@Autowired
	private DelService ds;
	
	@RequestMapping(value="/del", method=RequestMethod.GET)
	public @ResponseBody List<Del> delList(@ModelAttribute Del d) {
		return ds.getDelList(d);
	}
	
	@RequestMapping(value="/del/{num}", method=RequestMethod.GET)
	public @ResponseBody Del delList(@PathVariable Integer d) {
		return ds.getDel(d);
	}
	
	@RequestMapping(value="/del/{num}", method=RequestMethod.POST)
	public @ResponseBody int insertDel(@ModelAttribute Del d, @PathVariable Integer num) {
		logger.debug("del => {}", d);
		return ds.insertDel(d);
	}
	
	@RequestMapping(value="/del/{num}", method=RequestMethod.PUT)
	public @ResponseBody int updateDel(@RequestBody Del d, @PathVariable Integer num) {
		logger.debug("del => {}", d); 
		return ds.updateDel(d);
	}
	
	@RequestMapping(value="/del/{num}",method=RequestMethod.DELETE)
	public @ResponseBody int deleteDel(@PathVariable int num) {
		logger.debug("del => {}",num);
		return ds.deleteDel(num);
	}
}
