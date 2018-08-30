package com.java8.predefinedfunction.supplier;

import java.util.function.Supplier;

public class SupplierTest2 {

	public static void main(String[] args) {
		
		Supplier<String> s = () -> {
			String[] s1 = {"Sunny","Bunny","Chinny","Vinny"};
			int x = (int)(Math.random()*4);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
