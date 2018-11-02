package com.cg.springmvcthree.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcthree.dto.Mobile;
@Repository("mobiledao")
public class IMobileDaoImpl implements IMobileDao {
@PersistenceContext
	EntityManager em;
	@Override
	public List<Mobile> getAllDetails() {
		// TODO Auto-generated method stub
		Query queryGet=em.createQuery("FROM Mobile");
		List<Mobile> myList=queryGet.getResultList();
		return myList;
	}

}
