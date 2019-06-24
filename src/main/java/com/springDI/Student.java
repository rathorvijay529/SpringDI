package com.springDI;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
//  public Student(int rollno, String name) {
//		super();
//		this.rollno = rollno;
//		this.name = name;
//	}
//
int rollno;
 String name;
//  
  Department department;

  HashMap<String, Department> departments;
//public Department getDepartment() {
//	return department;
//}

public void setDepartment(Department department) {
	this.department = department;
	department.display();
}
  
 ArrayList<Integer> arr ;        

  public void display()
  {
	  System.out.println("student rollno"+rollno+" and tname is "+name);
	  System.out.println("");
	  
	  
  }

public void setRollno(int rollno) {
	this.rollno = rollno;
}


public void setName(String name) {
	this.name = name;
}

public Student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}


public void setDepartments(HashMap<String, Department> departments) {
	this.departments = departments;
}


  
  
  
  
  
  
  
  
}
