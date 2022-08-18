package com.employeemanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeemanagement.model.Employee;

@Service
public interface EmployeeService {
		List<Employee> findAll();  
}
