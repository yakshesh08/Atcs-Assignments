package com.cap.service;

import java.util.List;

import com.cap.entity.Employee;

public interface EmployeeService {

	public abstract void addEmployee(Employee employee);

	public abstract void updateEmployee(Employee employee);

	public abstract void removeEmployee(int employee);

	public abstract Employee findEmployeeById(int eid);

	public abstract List<Employee> listEmployee();

}
