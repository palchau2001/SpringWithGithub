package com.spring.github.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RequestMapping()
public class TestController 
{
	@RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
	public ModelAndView indexPage()
	{		
		System.out.println("Test");
		return new ModelAndView("index");
	}	
}
