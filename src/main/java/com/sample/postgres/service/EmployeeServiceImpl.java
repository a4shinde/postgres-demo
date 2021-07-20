package com.sample.postgres.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.sample.postgres.dao.EmployeeDao;
import com.sample.postgres.entity.Employee;

/**
 * Implementation for Employee service method - for find , create and delete
 * 
 * @apiNote 
 */


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Resource 
	EmployeeDao employeeDao;
	
	/**
	 * List all employees in the database table : employee
	 * 
	 * @return <b>java.util.List<Employee> : List of Employees </b>
	 * 
	 */
	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}
	
	/**
	 * Insert an employee in the database
	 */
	@Override
	public void insertEmployee(Employee emp) {
		employeeDao.insertEmployee(emp);
		
	}
	
	/**
	 * Update Employee details
	 */
	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
		
	}
	
	/**
	 * Update Employee details
	 */
	@Override
	public void executeUpdateEmployee(Employee emp) {
		employeeDao.executeUpdateEmployee(emp);
		
	}
	
    /**
     * Delete Employee
     */
	@Override
	public void deleteEmployee(Employee emp) {
		employeeDao.deleteEmployee(emp);
		
	}
	
}
