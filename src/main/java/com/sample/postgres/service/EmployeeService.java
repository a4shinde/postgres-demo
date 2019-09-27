package com.sample.postgres.service;

import java.util.List;

import com.sample.postgres.entity.Employee;



/**
 * 
 * Interface Employee service: Methods  
 * 
 * @author 
 *
 */
public interface EmployeeService {
	
	List<Employee> findAll();

	void insertEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void executeUpdateEmployee(Employee emp);

	void deleteEmployee(Employee emp);
	
}
