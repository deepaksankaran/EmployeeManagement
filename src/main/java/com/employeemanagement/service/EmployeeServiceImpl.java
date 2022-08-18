package com.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employeemanagement.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> findAll() {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();  
		employeeList.add(new Employee(001,"Arun","Kumar","MBA","arunkumar001@ycl.com"));
		employeeList.add(new Employee(002,"Sanu","Mathew","BBA","sanu1995@ycl.com"));
		employeeList.add(new Employee(003,"Kiran","S","MCA","kiran1997@ycl.com"));
		employeeList.add(new Employee(004,"Anjali","P","B Tech","anjalip@ycl.com"));
		employeeList.add(new Employee(005,"Sai","Sree","M Tech","saisree@ycl.com"));
		
		return employeeList;
	}

}
