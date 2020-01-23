package com.dao.ventas.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.dao.ventas.model.dao.IGenericDAO;

public class GenericDAOImpl<T, ID> implements IGenericDAO<T, ID>{
	
	private SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    private Session session = sessionFactory.openSession();

	public void agregar(T object) {
		session.beginTransaction();
		session.save(object);
		session.getTransaction().commit();
	}

	public void actualizar(T object) {
		session.beginTransaction();
		session.update(object);
		session.getTransaction().commit();
	}

	public void borrar(T object) {
		session.beginTransaction();
		session.delete(object);
		session.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listar(Class<T> type) {
		//Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(type);
		return criteria.list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public Session getSession() {
		return session;
	}
	
}
