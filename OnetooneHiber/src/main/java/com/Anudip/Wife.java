package com.Anudip;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Wife {
	
	@Id
	private int w_id;
	private String WName;
	@OneToOne
	private Husband husband;
	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wife(int w_id, String wName, Husband husband) {
		super();
		this.w_id = w_id;
		WName = wName;
		this.husband = husband;
	}
	public int getW_id() {
		return w_id;
	}
	public void setW_id(int w_id) {
		this.w_id = w_id;
	}
	public String getWName() {
		return WName;
	}
	public void setWName(String wName) {
		WName = wName;
	}
	public Husband getHusband() {
		return husband;
	}
	public void setHusband(Husband husband) {
		this.husband = husband;
	}
	
}
