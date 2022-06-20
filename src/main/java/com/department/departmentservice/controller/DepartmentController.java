package com.department.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.departmentservice.entity.Department;
import com.department.departmentservice.service.DepartmentService;
import com.sun.tools.sjavac.Log;

import lombok.extern.slf4j.Slf4j;

@RestController

@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	

	@RequestMapping("/departments")
	public String show() {
		 return "Hello";
	}
	
	@PostMapping("/addDepartment")
	public Department saveDepartment (@RequestBody Department department) {
		
		Log.info("Enter into controller");
		
		return departmentService.saveDepartment(department);
	}

}
