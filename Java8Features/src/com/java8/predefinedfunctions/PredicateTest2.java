package com.java8.predefinedfunctions;

import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		Predicate<String> p = s -> s.length()>5;
		System.out.println(p.test("abcdef"));
		System.out.println(p.test("abc"));

	}

}
