package com.org.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller
public class HomeController
{
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage()
	{
		return "home";
	}
}

