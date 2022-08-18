package com.test;

public class Parent {
	int x;
	int y;
	int z;
	static {
		System.out.println("Static block");
	}

	Parent(int x, int y) {
		this.x = x;
		this.y = y;		
		z=x*56+y*5;
		System.out.println("test ");
	}

	public static void main(String[] args) {
		System.out.print("main method");
	}

	public static int addition() {
	
		return 2;
	}
}
