package com.java8.lambda.functionalinterfaces;

interface Interf9{
	public int square(int n);
}
public class SqureWithLambda {
	public static void main(String[] args) {
		Interf9 i = n -> n*n;
		System.out.println(i.square(9));
		System.out.println(i.square(11));
	}
}