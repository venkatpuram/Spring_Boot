package com.capgemini.rest.restservices.service;

import java.util.List;

import com.capgemini.rest.restservices.entity.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
}
