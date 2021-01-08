package com.bijoy.spring;

public class Pattern {
	public static void main(String[] args) {

		String[] alphabet = { "A", "B", "C", "D", "E", "F", "G", "H" };
		int val = 5;
		for (int i = 0; i < val; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(alphabet[j]);
			}
			System.out.println();
		}
	}
}
