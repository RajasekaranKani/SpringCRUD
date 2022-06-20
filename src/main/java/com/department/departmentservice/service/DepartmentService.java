package com.department.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.departmentservice.entity.Department;
import com.department.departmentservice.repository.DepartmentRepository;
import com.sun.tools.sjavac.Log;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
	
		Log.info("Enter into service");
		
		return departmentRepository.save(department);
	}
	

}
