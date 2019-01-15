package com.capgemini.rest.restservices.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.capgemini.rest.restservices.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepositoryImplementation<Employee, Integer>{

}
