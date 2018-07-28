package it.cast.cn.service;

import it.cast.cn.dao.Dao;
import it.cast.cn.javabean.Emploee;

public class Service {

	private Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public void save(Emploee emploee) {
		dao.save(emploee);
	}
	
}
