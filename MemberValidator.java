package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.entity.Admin;
import com.cognizant.entity.Member;
import com.cognizant.service.MemberLoginService;


@Component("MemberValidator")
public class MemberValidator implements Validator{
	@Autowired
	private MemberLoginService memberLoginService;

	
	public boolean supports(Class<?> arg0) {
		return arg0.equals(Member.class);
	}

	
	public void validate(Object arg0, Errors arg1) {
		Member member=(Member)arg0;
		boolean memberAuth=memberLoginService.doLogin(member);
	
		if(!memberAuth){
			arg1.rejectValue("userName", "com.cognizant.entity.Admin.userName.invalid");
		}
		
	}
}
