package com.java8.methodreference.doublecolonoperator;

public class MethodReferenceTest2 {
	
	public void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		MethodReferenceTest2  t = new MethodReferenceTest2();
		Runnable r = t::m1;
		Thread t1 = new Thread(r);
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
