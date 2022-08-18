package com.test;

public class HelloWorld {

	
	public static void main(String[] args) {
		System.out.println("Test");
		char s= 'A';
		char s1= 'a';
		
		System.out.println((int)s);
		int ascii=(int)s1-32;
		System.out.println((char)ascii);
		
		
	//	A----> 65 a--->97
		
		String s2="abc";
		char[] str=s2.toCharArray();
		for(int i=0;i<str.length;i++){
			int ascii1=(int)str[i]-32;
			System.out.print((char)ascii1);
		}
	
	}
}
