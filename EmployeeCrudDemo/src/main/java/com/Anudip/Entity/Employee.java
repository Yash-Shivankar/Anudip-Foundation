package com.Anudip.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_info")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	@Column(name="fName", length=20, nullable=false)
	private String fName;
	@Column(name="lName", length=20, nullable=false)
	private String lName;
	@Column(name="contact", length=10, nullable=false)
	private String phone;
	@Column(name="address", length=50)
	private String add;
	@Column(name="design", length=25, nullable=false)
	private String desig;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String fName, String lName, String phone, String add, String desig) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.phone = phone;
		this.add = add;
		this.desig = desig;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	

}
