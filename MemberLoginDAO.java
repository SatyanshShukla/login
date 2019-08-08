package com.cognizant.dao;

import com.cognizant.entity.Member;

public interface MemberLoginDAO {
	public boolean doLogin(Member member);
}
