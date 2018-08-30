package com.java8.anonymous.lambdaexpressions;

public class AnonymousThreadDemo1 {

	public static void main(String[] args) {
		
		/*Runnable r = new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
				}
			}
		};*/
		/*Runnable r = () -> {
			for(int i=0;i<10;i++) {
				System.out.println("Lambda Child Thread");
			}
		};
		Thread t = new Thread(r);*/
		Thread t = new Thread(()->{
									for(int i=0;i<10;i++) {
										System.out.println("Lambda Child Thread");
									}
								});
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
}
