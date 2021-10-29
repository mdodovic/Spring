package com.mdodovic.employeemanagement.dao;

import java.util.List;

import com.mdodovic.employeemanagement.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
}
