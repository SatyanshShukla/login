package com.cognizant.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Admin;
@Repository("AdminDAOImpl")
public class AdminLoginDAOImpl implements AdminLoginDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public boolean doLogin(Admin admin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=
				session.createQuery("select o from Admin o where o.userName=:username and o.password=:password");
		query.setParameter("username", admin.getUserName());
		query.setParameter("password", admin.getPassword());
		List<Admin> adminList=query.list();
		System.out.println(adminList);
		if(adminList.isEmpty())
			return false;
		else
		return true;
	}

}
