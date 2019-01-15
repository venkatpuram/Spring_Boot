package com.capgemini.rest.restservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.rest.restservices.entity.Employee;
import com.capgemini.rest.restservices.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;

	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	
}
