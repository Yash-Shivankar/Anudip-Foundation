package com.Anudip;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int D_id;
	private String DName;
	@OneToMany
	private Set<Employee> employee;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int d_id, String dName, Set<Employee> employee) {
		super();
		D_id = d_id;
		DName = dName;
		this.employee = employee;
	}
	public int getD_id() {
		return D_id;
	}
	public void setD_id(int d_id) {
		D_id = d_id;
	}
	public String getDName() {
		return DName;
	}
	public void setDName(String dName) {
		DName = dName;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	
	

}
