package com.java8.predefinedfunctions;

import java.util.function.Predicate;

public class PredicateIsEqual {

	public static void main(String[] args) {
		
		Predicate<String> p = Predicate.isEqual("Eeranna");
		System.out.println(p.test("Eeranna"));
		System.out.println(p.test("Teju"));

	}

}
