package com.Anudip;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_details")
public class Employee {
	@javax.persistence.Id
	private int Id;
	@Column(name = "EmpName")
	private String Name;
	private String Desig;
	private int sal;
	@ManyToOne
	private Department department;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String desig, int sal, Department department) {
		super();
		Id = id;
		Name = name;
		Desig = desig;
		this.sal = sal;
		this.department = department;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesig() {
		return Desig;
	}
	public void setDesig(String desig) {
		Desig = desig;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	
}
