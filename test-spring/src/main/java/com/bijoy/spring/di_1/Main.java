package com.bijoy.spring.di_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di1.xml");
		System.out.println(((Car) ac.getBean("car")).getColor());
		System.out.println(((Car) ac.getBean("car")).getColor());
	
	}
}
