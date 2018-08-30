package com.java8.lambda.functionalinterfaces;

@FunctionalInterface
public interface Parent {
	public void m1();
}

@FunctionalInterface
interface Child extends Parent {
	public void m1();
	//public void m2();
}
