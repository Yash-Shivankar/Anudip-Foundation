package com.Anudip;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent {
	@Id
	private int P_id;
	private String PName;
	@OneToMany
	private Set<Child> child;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent(int p_id, String pName, Set<Child> child) {
		super();
		P_id = p_id;
		PName = pName;
		this.child = child;
	}
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public Set<Child> getChild() {
		return child;
	}
	public void setChild(Set<Child> child) {
		this.child = child;
	}
	
	

}
