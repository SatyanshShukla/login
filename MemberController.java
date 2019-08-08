package com.cognizant.control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.cognizant.entity.Member;

public class MemberController {
	
	@RequestMapping(value="member.htm",method=RequestMethod.GET)
	public String VendorLoginForm(){
		return "memberlogin";
	}
	
	@RequestMapping(value="memberlogin.htm",method=RequestMethod.POST)
	public ModelAndView vendorLogin(@ModelAttribute("member") MemberLoginDAO member,Errors errors,HttpSession session){
		ValidationUtils.invokeValidator(membervalidator, member , errors);
		ModelAndView mv=new ModelAndView();
		if(errors.hasErrors()){
			mv.setViewName("memberlogin");
		}else{

		
	//	List<Product> productList=productService.getAllProducts();
	//	mv.addObject("productList",productList);
	//session.setAttribute("username", vendor.getUserName());
		mv.setViewName("viewproducts");
		}
		return mv;
	}


	@ModelAttribute("member")
	public MemberLoginDAO createMemberObject(){
		MemberLoginDAO member=new MemberLoginDAO();
		return member;
}
	
}
