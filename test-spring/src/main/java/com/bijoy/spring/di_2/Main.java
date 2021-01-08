package com.bijoy.spring.di_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di2.xml");
//		System.out.println(((Employee) ac.getBean("employee")).toString());
		
		Employee emp= (Employee)ac.getBean("employee");
		System.out.println(emp.toString());

	}
}
