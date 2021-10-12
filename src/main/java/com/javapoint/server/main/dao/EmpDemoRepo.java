package com.javapoint.server.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javapoint.server.main.entity.EmpDemo;

public interface EmpDemoRepo extends JpaRepository<EmpDemo, Integer>{

	EmpDemo findByEmail(String email);

}
