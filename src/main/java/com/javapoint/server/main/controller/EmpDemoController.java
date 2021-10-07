package com.javapoint.server.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javapoint.server.main.entity.EmpDemo;
import com.javapoint.server.main.service.EmpDemoService;

@Controller
@RequestMapping("/employees")
public class EmpDemoController {
	@Autowired
	EmpDemoService empDemoService;
	
	@GetMapping("/")
	public String showFormforAdd(Model theModel) {
		
		//create model attribute to bind form data
		EmpDemo theEmployee = new EmpDemo();
		
		theModel.addAttribute("employee" , theEmployee);
		return "employees/employee-form";
	}
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") EmpDemo theEmployee) {
		
		//save the employee
		empDemoService.saveEmployee(theEmployee);
		
		//use a redirect to prevent duplicate submissions
		return "employees/employee-form";
	}
	

}
