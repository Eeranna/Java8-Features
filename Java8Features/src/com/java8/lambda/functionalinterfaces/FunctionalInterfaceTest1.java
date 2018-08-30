package com.java8.lambda.functionalinterfaces;
interface TestInterf1{
	public void m1(int i);
	//public void m2(int a,int b);
}

public class FunctionalInterfaceTest1 {

	public static void main(String[] args) {
		TestInterf1 t = i -> System.out.println(i*i);
		t.m1(10);
		t.m1(20);
	}

}
