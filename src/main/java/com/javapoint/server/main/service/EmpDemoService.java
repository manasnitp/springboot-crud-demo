package com.javapoint.server.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.javapoint.server.main.dao.EmpDemoRepo;
import com.javapoint.server.main.entity.EmpDemo;

public interface EmpDemoService {
	
	public void saveEmployee(EmpDemo empDemo);

	public List<EmpDemo> findAll();

	public EmpDemo findByEmail(String email);

	public Optional<EmpDemo> findById(int id);

	public void deleteById(int id);

}
