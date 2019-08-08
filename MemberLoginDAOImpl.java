package com.cognizant.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Member;
@Repository("MemberLoginDAOImpl")
public class MemberLoginDAOImpl implements MemberLoginDAO{
	
	@Autowired 
	private SessionFactory sessionFactory;
	public boolean doLogin(Member member) {
	
		

			Session session=sessionFactory.openSession();
			Query query=
					session.createQuery("select o from Member o where o.userName=:username and o.password=:password");
			query.setParameter("username", member.getUserName());
			query.setParameter("password", member.getPassword());
			List<Member> memberList=query.list();
		
			if(memberList.isEmpty())
				return false;
			else
			return true;
		}
}
