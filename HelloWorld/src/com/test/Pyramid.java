package com.test;

public class Pyramid {
	public static void main(String[] args) {
		int term = 6;
		for (int i = 1; i <= term; i++) {
			for (int j = term; j >= i; j--) {
				//System.out.print(j);
				if(j==2){
					System.out.println("j :"+j);
				}
			}
			System.out.println();
		}
	}
}