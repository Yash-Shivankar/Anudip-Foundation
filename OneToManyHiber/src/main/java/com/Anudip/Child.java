package com.Anudip;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Child {
	@Id
	private int C_id;
	private String CName;
	@ManyToOne
	private Parent parent;
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child(int c_id, String cName, Parent parent) {
		super();
		C_id = c_id;
		CName = cName;
		this.parent = parent;
	}
	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	

}
