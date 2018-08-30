package com.java8.predefinedfunctions;

import java.util.function.Predicate;

public class PredicateTest1 {

	public static void main(String[] args) {
	
		Predicate<Integer> p = I -> I>10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));
		//System.out.println(p.test("abc"));
	}

}
