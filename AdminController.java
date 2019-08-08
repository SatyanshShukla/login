package com.cognizant.control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.Admin;
import com.cognizant.entity.Product;

public class AdminController {
	@RequestMapping(value="admin.htm",method=RequestMethod.GET)
	public String loadLoginForm(){
		return "adminlogin";
	}
	
	@RequestMapping(value="doLogin.htm",method=RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("admin") Admin admin,Errors errors,HttpSession session){
		ValidationUtils.invokeValidator(adminvalidator, admin, errors);
		ModelAndView mv=new ModelAndView();
		if(errors.hasErrors()){
			mv.setViewName("adminlogin");
		}else{

		
		List<Product> productList=productService.getAllProducts();
		mv.addObject("productList",productList);
	session.setAttribute("username", admin.getUserName());
		mv.setViewName("viewproducts");
		}
		return mv;
	}
	
	@RequestMapping(value="admin.htm",method=RequestMethod.GET)
	public String loadLoginForm(){
		return "adminlogin";
	}
}
