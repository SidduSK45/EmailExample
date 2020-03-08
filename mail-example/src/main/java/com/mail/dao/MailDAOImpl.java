package com.mail.dao;

import java.io.Serializable;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mail.entity.MailEntity;
import com.mysql.cj.xdevapi.SessionFactory;
@Repository
public class MailDAOImpl implements MailDAO{
	private static Logger logger = Logger.getLogger(MailDAOImpl.class);
	
	@Autowired
	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public MailDAOImpl() {
		logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}

	public Serializable save(MailEntity entity) {
		logger.info("inside getMessage()...Invoking save method from DAOImpl");
		Session session = null;
		
		try {
			
			session = factory.openSession();

			session.beginTransaction();

			session.save(entity);

			session.getTransaction().commit();
			logger.info("inside getMessage()...Data saved in DataBase succesfully.");

			
		}catch (Exception e) {
			logger.info("INFO:"+e.getMessage());
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				logger.info("inside getMessage()...Resources closed.");
			}
		
		return (Serializable) entity;
	}

	
	}}
