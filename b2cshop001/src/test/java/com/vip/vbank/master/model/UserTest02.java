package com.vip.vbank.master.model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.vip.vbank.master.dao.UserDao;

/**
 * 使用Spring结合Hibernate
 * 
 * @author sf
 *
 */

public class UserTest02 {

	@Test
	public void addUserTest() {
		User user = new User();
		user.setId(1007);
		user.setName("段誉");
		user.setSex("2");
		user.setAddress("大理");

		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserDao userDao = (UserDao) ac.getBean("userDao");
		
		userDao.save(user);

	}
	
	//暂没有跑通
/* 	 @Test
	public void addUserTest2(){
		
		User user = new User();
		user.setId(1002);
		user.setName("段誉");
		user.setSex("2");
		user.setAddress("大理");
		
		BeanFactory factory = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		SessionFactory sessionFactory = (SessionFactory) factory.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		session.save(user);
		tx.commit();
		session.close();
	}*/
}
