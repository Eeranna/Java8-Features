package com.java8.anonymous.lambdaexpressions;

interface Interf1{
	public void m1();
}

public class AnonymousTest1 {

	int x = 10;
	public void m2() {
		int y = 20;
		Interf1 i = () -> {
			x=888;
			//y=999;Local variable y defined in an enclosing scope must be final or effectively final
			System.out.println(x);
			System.out.println(y);
		};
		i.m1();
	}
	public static void main(String[] args) {
		AnonymousTest1 t = new AnonymousTest1();
		t.m2();

	}

}
