package com.cap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cap.entity.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext  
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		Employee emp = entityManager.find(Employee.class, eid);
		return emp;
	}
	@Override

	public void addEmployee(Employee emp) {
		entityManager.persist(emp);
	}

	@Override

	public void removeEmployee(int emp) {
		Employee emp1=getEmployeeById(emp);
		entityManager.remove(emp1);
	}

	@Override

	public void updateEmployee(Employee emp) {
		entityManager.merge(emp);
	}


	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub

		TypedQuery<Employee> q2 = entityManager.createQuery("select c from Employee c", Employee.class);
		List<Employee> l1 = q2.getResultList();
		return l1;
	}

}
