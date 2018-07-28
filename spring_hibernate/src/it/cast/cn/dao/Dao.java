package it.cast.cn.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import it.cast.cn.javabean.Emploee;

public class Dao {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	
	public void save(Emploee emploee){
		Transaction ts =  factory.getCurrentSession().beginTransaction();
		factory.getCurrentSession().save(emploee);
		ts.commit();
		factory.getCurrentSession().close();
	}
	
	
}
