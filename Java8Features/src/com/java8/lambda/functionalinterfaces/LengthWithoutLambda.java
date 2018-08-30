package com.java8.lambda.functionalinterfaces;

interface Interf6{
	public int getLength(String s);
}

class Demo2 implements Interf6{
	public int getLength(String s) {
		return s.length();
	}
}

public class LengthWithoutLambda {

	public static void main(String[] args) {
		Interf6 i = new Demo2();
		System.out.println(i.getLength("Hello"));
		System.out.println(i.getLength("Welcome"));
	}

}
