package com.yg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentdbjparest")
public class Student {
	@Id
	@Column(name="sid",length=10)
	private int stuId;
	
	@Column(name="sname",length=15)
	private String stuName;
	
	@Column(name="sfname",length=15)
	private String stuFName;
	
	@Column(name="sadd",length=20)
	private String stuAdd;
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuFName() {
		return stuFName;
	}
	public void setStuFName(String stuFName) {
		this.stuFName = stuFName;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, String stuName, String stuFName, String stuAdd) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuFName = stuFName;
		this.stuAdd = stuAdd;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuFName=" + stuFName + ", stuAdd=" + stuAdd
				+ "]";
	}
	
	

}
