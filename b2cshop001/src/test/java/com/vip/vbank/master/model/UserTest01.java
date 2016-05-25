package com.vip.vbank.master.model;



import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/*import org.hibernate.boot.registry.StandardServiceRegistryBuilder;*/
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

/**
 * 直接使用hibernate测试
 * @author sf
 *
 */  
public class UserTest01 {
	
	
	
	@Test
	public void addUserTest(){
		
/*		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory;
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		
		User user = new User();
		user.setName("张三丰");
		user.setSex("1");
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Serializable id = session.save(user);
		tx.commit();
		session.close();
		System.out.println("id=" + id);*/
	}
}
