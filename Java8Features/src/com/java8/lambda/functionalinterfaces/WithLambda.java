package com.java8.lambda.functionalinterfaces;
interface Interf3{
	public void m1();
}
public class WithLambda {
	public static void main(String[] args) {
		Interf3 i = () -> System.out.println("m1 method implementation!!!");
		i.m1();
	}
}	
