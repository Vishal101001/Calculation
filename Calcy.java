package com.second;
//polymorphism
//method name same and 
//passing argument is differents

public class Calcy {
	
	public int calculation(int a,int b) {
		return a+b;
	}
	public double calculation(int c, double d) {
		return c-d;
	}
	public double calculation(double e, int f) {
		return e*f;
	}
	public double calculation(double g, double h) {
		return g/h;
	}
	public static void main(String[] args) {
		Calcy c1 = new Calcy();
	
		System.out.println(c1.calculation(10, 5));
		System.out.println(c1.calculation(20, 2.2));
		System.out.println(c1.calculation(8.2, 5));
		System.out.println(c1.calculation(55.55, 11.11));
	}
	

}
