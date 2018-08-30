package com.java8.lambda.functionalinterfaces;

interface Interf2{
	public void m1();
}
class Demo implements Interf2{
	public void m1() {
		System.out.println("Demo class m1() method impl");
	}
}
public class WithoutLambda {

	public static void main(String[] args) {
		Interf2 i = new Demo();
		i.m1();
	}
}
