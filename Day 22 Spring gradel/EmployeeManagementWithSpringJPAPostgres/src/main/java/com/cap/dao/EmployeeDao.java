package com.cap.dao;

import java.util.List;

import com.cap.entity.Employee;

public interface EmployeeDao {

	public abstract Employee getEmployeeById(int eid);

	public abstract void addEmployee(Employee emp);

	public abstract void removeEmployee(int emp);

	public abstract void updateEmployee(Employee emp);

	public abstract List<Employee> listEmployee();

	
	
}
