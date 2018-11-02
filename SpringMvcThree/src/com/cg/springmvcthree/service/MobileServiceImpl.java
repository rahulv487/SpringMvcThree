package com.cg.springmvcthree.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcthree.dao.IMobileDao;
import com.cg.springmvcthree.dto.Mobile;
@Service("mobileservice")
@Transactional

public class MobileServiceImpl implements IMobileService{
@Autowired
IMobileDao mobiledao;
	
	@Override
	public List<Mobile> getAllDetails() {
		// TODO Auto-generated method stub
		return mobiledao.getAllDetails();
	}

}
