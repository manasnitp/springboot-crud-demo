package com.javapoint.server.main.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javapoint.server.main.entity.EmpDemo;
import com.javapoint.server.main.service.EmpDemoService;

@Controller
@RequestMapping("/employees")
public class EmpDemoController {
	@Autowired
	EmpDemoService empDemoService;
	
	@GetMapping("/")
	public String allEmployees(Model theModel) {
		List<EmpDemo> employees =  empDemoService.findAll();
		theModel.addAttribute("employees" , employees);
		return "employees/emp-list";
	}
	
	@GetMapping("/form")
	public String showFormforAdd(Model theModel) {
		
		//create model attribute to bind form data
		EmpDemo theEmployee = new EmpDemo();
		
		theModel.addAttribute("employee" , theEmployee);
		return "employees/employee-form";
	}
	@PostMapping("/save")
	public String saveEmployee(@Valid @ModelAttribute("employee") EmpDemo theEmployee , Errors errors) {
		
		//save the employee
		if(errors.hasErrors())
			return "employees/employee-form";
		
		empDemoService.saveEmployee(theEmployee);
		
		//use a redirect to prevent duplicate submissions
		return "redirect:/employees/";
	}
	@GetMapping("/updateForm")
	public String update(@RequestParam("employeeId") int id , Model theModel) {
		Optional<EmpDemo> emp =  empDemoService.findById(id);
		theModel.addAttribute("employee" , emp);
		return "employees/employee-form";
		
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int id)  {
		
		empDemoService.deleteById(id);
		return "redirect:/employees/";
	}
	
	

}
