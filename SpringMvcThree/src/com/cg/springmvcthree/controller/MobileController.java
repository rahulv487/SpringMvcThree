package com.cg.springmvcthree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcthree.dto.Mobile;
import com.cg.springmvcthree.service.IMobileService;


@Controller
public class MobileController {
	@Autowired
	IMobileService mobileservice;
@RequestMapping(value="showall",method=RequestMethod.GET)
public ModelAndView getAllDetails(){
	List<Mobile> mobData=mobileservice.getAllDetails();
	return new ModelAndView("mobileshow", "data", mobData);
	
}
@RequestMapping(value="purchase",method=RequestMethod.GET)	
public ModelAndView dataDisplay(@RequestParam("mobname")String mname){
		return new ModelAndView("purchasedetail","ename",mname);
	}
}
