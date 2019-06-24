package com.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//      Student stu = new Student();
//      stu.name= "vvvv";
//      stu.rollno = 123;
//      stu.display();
      
//    	 Student stu = new Student();
//    	 stu.setName("vvvv");
//    	 stu.setRollno(123);
//    	 stu.display();
    	 
  ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    Student student= (Student)context.getBean("student");//like setter injection only
    student.display();
    Department dep= (Department)context.getBean("department");
    dep.display();
    }
}
