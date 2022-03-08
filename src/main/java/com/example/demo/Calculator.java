package com.example.demo;

public class Calculator {

	public double sum(double a , double b) {
		return a+b;
	}
	public double prod(double a, double b) {
		return a*b;
	}
	
	public double calculate(double a, double b) {
		if(a==0 && b==0) {
			throw new IllegalArgumentException("invalid values");
		}
		return prod(a,b)/sum(a,b);
	}
}
