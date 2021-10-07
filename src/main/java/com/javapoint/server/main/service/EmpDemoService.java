package com.javapoint.server.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.javapoint.server.main.dao.EmpDemoRepo;
import com.javapoint.server.main.entity.EmpDemo;

public interface EmpDemoService {
	
	public void saveEmployee(EmpDemo empDemo);

}
