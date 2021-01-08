package com.bijoy.spring.di_1;

public class Car {
	private String color;
	
	public Car() {
		System.out.println("Car - Constructor");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
