package com.java8.lambda.functionalinterfaces;

interface Interf7{
	public int getLength(String s);
}
public class LengthWithLambda {
	public static void main(String[] args) {
		//Interf7 i = (String s) -> {return s.length();}
		//Interf7 i = (s) -> return s.length();
		Interf7 i = s -> s.length();
		System.out.println(i.getLength("Hello Eeranna"));
		System.out.println(i.getLength("Welcome to java8"));
	}
}
