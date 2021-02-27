package com.api.employee.controllers;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.employee.model.Employee;

@RestController
@RequestMapping("/api/v1/employees")
public class TestController 
{

	private Employee emp=new Employee();
	
	@GetMapping()
	public  ResponseEntity<Employee> firstPage() 
	{
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		 return ResponseEntity.status(HttpStatus.OK).body(emp); 
	}
}
