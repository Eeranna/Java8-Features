package com.java8.anonymous.lambdaexpressions;

interface Interf{
	public void m1();
}

public class AnonymousTest {

	int x = 888;
	public void m2() {
		/*Interf i = new Interf() {
			int x = 999;
			public void m1() {
				System.out.println(this.x);//999
			}
		};*/
		Interf i = () -> {
			int x = 999;
			System.out.println(this.x);//888
		};
		i.m1();
	}
	public static void main(String[] args) {
		AnonymousTest t = new AnonymousTest();
		t.m2();
	}

}
