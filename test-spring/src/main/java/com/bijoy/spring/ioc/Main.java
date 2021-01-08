package com.bijoy.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//class Calc {
//	public int sum(int a, int b) {
//		return a + b;
//	}
//}

class Key {
//	public void run() {
//		new Bike().start();
//	}

//	public void run(Car key) {
//		key.start();
//	}
//	
//	public void run(Bike key) {
//		key.start();
//	}

	public void run(Engine key) {
		key.start();
	}
}

public class Main {
	public static void main(String[] args) {
		// System.out.println(new Calc().sum(2, 4));
//		 new Key().run();

//		new Key().run(new Car());//		
//		new Key().run(new Bike());

//		new Key().run(new Bike());

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans-ioc.xml");
		new Key().run((Engine) ac.getBean("engine"));

	}
}
