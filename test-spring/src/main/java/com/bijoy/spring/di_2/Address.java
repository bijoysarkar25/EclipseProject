package com.bijoy.spring.di_2;

public class Address {
	private String street;
	private String city;
	private String state;
	private String pin;

	public Address(String street, String city, String state, String pin) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}

}
