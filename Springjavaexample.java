package com.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springjavaexample {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("Studentxmlexample.xml");
		Student s = (Student)context.getBean("s1");
	
		System.out.println(s.getName());
		System.out.println(s.getId());
	}

}



