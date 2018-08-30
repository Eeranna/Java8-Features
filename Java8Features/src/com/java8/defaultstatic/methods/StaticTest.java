package com.java8.defaultstatic.methods;

interface Interf1{
	public static void m1() {
		System.out.println("Interface static method!!!");
	}
}

public class StaticTest {

	public static void main(String[] args) {
		//m1();
		//StaticTest t = new StaticTest();
		//t.m1();
		//StaticTest.m1();
		Interf1.m1();
	}

}
