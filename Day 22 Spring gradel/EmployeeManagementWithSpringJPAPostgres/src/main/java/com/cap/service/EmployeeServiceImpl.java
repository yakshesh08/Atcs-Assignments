package com.cap.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cap.dao.EmployeeDao;
import com.cap.entity.Employee;



@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	@Override
	public void addEmployee(Employee emp) {  
	
		dao.addEmployee(emp);//persist()
	}
	@Override
	public void updateEmployee(Employee emp) {
		dao.updateEmployee(emp);
	}
	@Override
	public void removeEmployee(int emp) {
		dao.removeEmployee(emp);
	}
	@Override
	public Employee findEmployeeById(int eid) {
		// no need of transaction, as it's an read operation
		Employee emp = dao.getEmployeeById(eid);
		return emp;
	}
	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		List<Employee> l1 = dao.listEmployee();
		return l1;
	}
}