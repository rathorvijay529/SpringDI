package com.springDI;

public class Department {
	int departmentid;
	String departmentname;
	
	public void display() {
		System.out.println("department id"+departmentid+" and departmentname is "+departmentname);
		
	}

	public Department(int departmentid, String departmentname) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
	}

	
	
}
