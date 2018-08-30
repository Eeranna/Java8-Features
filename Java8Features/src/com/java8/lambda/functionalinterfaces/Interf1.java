package com.java8.lambda.functionalinterfaces;

@FunctionalInterface
public interface Interf1 {
	
	public void m1();
	//public void m4();
	default void m2() {
	}
	
	public static void m3() {
	}
}
