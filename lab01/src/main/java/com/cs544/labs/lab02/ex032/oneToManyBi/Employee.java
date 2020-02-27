package com.cs544.labs.lab02.ex032.oneToManyBi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empNum;
	private String name;
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department dept;

	public Employee() {

	}

	public Employee(String name, Department dept) {
		this.name = name;
		this.dept = dept;
	}

	public long getEmpNum() {
		return empNum;
	}

	public void setEmpNum(long empNum) {
		this.empNum = empNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empNum=" + empNum + ", name=" + name + ", dept=" + dept + "]";
	}
	

}
