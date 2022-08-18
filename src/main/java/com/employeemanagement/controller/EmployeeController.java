package com.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.model.Employee;
import com.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired  
	private EmployeeService employeeService;
	
	//mapping the getEmployees() method to /employee  
	@GetMapping(value = "/employee")  
	public List<Employee> getEmployees()   
	{  
	//finds all the employees  
	List<Employee> employeeList = employeeService.findAll();  
	//returns the employee list  
	return employeeList;  
	}  
}
