package com.sample.postgres.dao;

import java.util.List;

import com.sample.postgres.entity.Employee;

/**
 * @author
 *
 */
public interface EmployeeDao {

	List<Employee> findAll();

	void insertEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void executeUpdateEmployee(Employee emp);

	public void deleteEmployee(Employee emp);

}
