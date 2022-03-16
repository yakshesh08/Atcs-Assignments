package com.cap;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cap.config.AppConfig;
import com.cap.entity.Employee;
import com.cap.service.EmployeeService;
import com.cap.service.EmployeeServiceImpl;
public class EmployeeUi {
	static Scanner sc = new Scanner(System.in);
	Employee emp = new Employee();
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService service = context.getBean("employeeService",EmployeeServiceImpl.class);
		while (true) {
			System.out.println("\n\n\n\n\nEmployee Crud Operation:");
			System.out.println("1.Create Employee");
			System.out.println("2.Find Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.List All Employees");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Employee Name: ");
				String ename = sc.next();
				System.out.println("Enter Employee Salary: ");
				int esal = sc.nextInt();
				System.out.println("Enter Employee City: ");
				String city = sc.next();
				
				Employee emp = new Employee();
				emp.setEname(ename);
				emp.setEsal(esal);
				emp.setCity(city);
				service.addEmployee(emp);
				System.out.println("Employee Inserted");
				break;
			case 2:
				System.out.println("Enter Id to fetch Employee:");
				int eid = sc.nextInt();
				Employee findemp = service.findEmployeeById(eid);
				if (findemp == null) {
					System.out.println("no employees present");
				} else {
					System.out.println("Employee Id:" + findemp.getEid());
					System.out.println("Employee Name:" + findemp.getEname());
					System.out.println("Employee Salary:" + findemp.getEsal());
					System.out.println("Employee City:" + findemp.getCity());}
				break;
			case 3:
				System.out.println("Enter Id to fetch Employee:");
				int id = sc.nextInt();
				System.out.println("Enter the name to update:");
				String updename = sc.next();
				Employee updateemp = service.findEmployeeById(id);
				if (updateemp == null) {
					System.out.println("No employee present");
				} else {
					updateemp.setEname(updename);
					service.updateEmployee(updateemp);
					System.out.println("Employee name Updated");
				}
				break;
			case 4:
				System.out.println("Enter Id to Delete Employee:");
				int did = sc.nextInt();
				service.removeEmployee(did);
				System.out.println("Employee deleted successfully");
				break;
			case 5:
				List<Employee> l1 = service.listEmployee();
				System.out.println("\t Employee Id  \t Employee Name  \t Employee Salary \t City");
				System.out.println("********************************************");
				for (Employee e1 : l1) {
					System.out.println(" \t     " + e1.getEid() + " \t\t "
							+ e1.getEname() + " \t \t  \t    " + e1.getEsal()
							+ " \t \t \t     " + e1.getCity());}
				System.out.println("********************************************");
				break;
			case 6:
				System.out.println("Exited from Employee application");
				sc.close();
				System.exit(1);
			default:
				System.out.println("Wrong choice....\n Please Enter Your Choice Again...");
				break;
			}
		}
	}
}