package com.java8.lambda.functionalinterfaces;

interface Interf8{
	public int square(int n);
}
class Demo4 implements Interf8{
	public int square(int n) {
		return n*n;
	}
}
public class SqureWithoutLambda {
	public static void main(String[] args) {
		Interf8 i = new Demo4();
		System.out.println(i.square(8));
		System.out.println(i.square(10));
	}
}
