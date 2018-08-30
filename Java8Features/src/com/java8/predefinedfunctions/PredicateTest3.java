package com.java8.predefinedfunctions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
//write a predicate whether given collection is empty or not
public class PredicateTest3 {

	public static void main(String[] args) {
		Predicate<Collection<String>> p = c -> c.isEmpty();
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("ABC");
		System.out.println(p.test(l1));
		ArrayList<String> l2 = new ArrayList<String>();
		System.out.println(p.test(l2));
	}

}
