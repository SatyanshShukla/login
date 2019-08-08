package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.AdminLoginDAO;
import com.cognizant.entity.Admin;

@Service("AdminLoginServiceImpl")
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminLoginDAO adminLoginDAO;
	
	
	public boolean doLogin(Admin admin) {
		
		return adminLoginDAO.doLogin(admin);
	}

}
