package SpringCoreAutowireAtc.com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("yaksh")


public class Employee { //beans class or POJO CLASS 
	
	private int empid;
	private String empname;
	private int empsal;
	
	       //@Autowired   //by type
	       Address address; //has -a dependent object //has a raltion
	      
	       //dependent object will injecting(created) automatically
	     
			public int getEmpid() {
				return empid;
			}
			public void setEmpid(int empid) {
				this.empid = empid;
			}
			public String getEmpname() {
				return empname;
			}
			public void setEmpname(String empname) {
				this.empname = empname;
			}
			public int getEmpsal() {
				return empsal;
			}
			public void setEmpsal(int empsal) {
				this.empsal = empsal;
			}
			public Address getAddress() {
				return address;
			}
			@Autowired  //byName
			public void setAddress(Address address) {
				this.address = address;
			}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	//@Autowired
	public Employee(int empid, String empname, int empsal, Address address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", address=" + address
				+ "]";
	}
	
	
	
}