package com.bng.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/add")
	public String addEmployee(Employee emp)
	{
		repo.save(emp);
		return "home.jsp";
	}

}
