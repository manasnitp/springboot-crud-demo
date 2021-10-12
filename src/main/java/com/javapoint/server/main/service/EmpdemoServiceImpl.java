package com.javapoint.server.main.service;

import java.util.List;
import java.util.Optional;

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
	@Override
	public List<EmpDemo> findAll() {
		return empDemoRepo.findAll();
	}
	@Override
	public Optional<EmpDemo> findById(int id) {
		Optional<EmpDemo> emp =  empDemoRepo.findById(id);
		return emp;
	}
	@Override
	public EmpDemo findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteById(int id) {
		empDemoRepo.deleteById(id);
		
	}

}
