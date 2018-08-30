package com.java8.defaultstatic.methods;

interface Left{
	default void m1() {
		System.out.println("Left m1()");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right m1()");
	}
}

public class DefaultMultipleInheritanceTest implements Left,Right {

	public void m1() {
		System.out.println("My onw impl m1()");
		Left.super.m1();
		Right.super.m1();
	}
	public static void main(String[] args) {
		DefaultMultipleInheritanceTest t = new DefaultMultipleInheritanceTest();
		t.m1();
	}

}
