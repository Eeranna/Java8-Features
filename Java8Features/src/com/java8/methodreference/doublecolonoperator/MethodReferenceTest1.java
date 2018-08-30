package com.java8.methodreference.doublecolonoperator;

interface Interf{
	public void m1();
}

public class MethodReferenceTest1 {

	public static void m2() {
		System.out.println("m2 method implementation...");
	}
	public static void main(String[] args) {
		
		Interf i = MethodReferenceTest1::m2;
		i.m1();

	}

}
