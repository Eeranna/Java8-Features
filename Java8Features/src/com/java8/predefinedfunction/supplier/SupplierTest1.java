package com.java8.predefinedfunction.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest1 {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
