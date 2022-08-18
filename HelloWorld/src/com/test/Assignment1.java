package com.test;

public class Assignment1 {

	
	public static void main(String[] args) {		
		String s= new String("hi");
		String s1= new String("hi");
		
		String s2= "hi";
		String s3="hi";
		
		
		if(s==s1){
			System.out.println( "true");
		}
		
		
		if(s2==s3){
			System.out.println( "true");
		}
		
		if(s.equals(s1)){
			System.out.println("s and s1 are equal");
		}
		
		if(s2.equals(s3)){
			System.out.println("s2 and s3 are equal");
		}
	}
	
	public static int conversion(int i){
		return (i-1);
	}
}
