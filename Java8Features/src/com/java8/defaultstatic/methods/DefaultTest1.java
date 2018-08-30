package com.java8.defaultstatic.methods;

interface Interf{
	default void m1() {
		System.out.println("default method!!!");
	}
}

public class DefaultTest1 implements Interf {

	public void m1() {
		System.out.println("My own default impl method!!!");
	}
	public static void main(String[] args) {
		
		DefaultTest1 dt = new DefaultTest1();
		dt.m1();

	}

}
