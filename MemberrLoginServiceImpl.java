package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.MemberLoginDAO;

import com.cognizant.entity.Member;


@Service("MemberLoginServiceImpl")
public class MemberrLoginServiceImpl implements MemberLoginService{
	@Autowired
	private  MemberLoginDAO memberLoginDAO;
	 public boolean doLogin(Member member) {
			
			return memberLoginDAO.doLogin(member);
		}

	}


