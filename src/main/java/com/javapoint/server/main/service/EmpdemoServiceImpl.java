package com.javapoint.server.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javapoint.server.main.dao.EmpDemoRepo;
import com.javapoint.server.main.entity.EmpDemo;

@Service
public class EmpdemoServiceImpl implements EmpDemoService {

	@Autowired
	EmpDemoRepo empDemoRepo;
	@Override
	public void saveEmployee(EmpDemo empDemo) {
		
		empDemoRepo.save(empDemo);
	}

}
