package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest5 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0);
		l1.add(10);
		l1.add(15);
		l1.add(25);
		l1.add(5);
		l1.add(30);
		l1.add(20);
		l1.add(35);
		System.out.println(l1);
		Integer[] array = l1.stream().toArray(Integer[]::new);
		for(Integer x:array) {
			System.out.println(x);
		}
		
		Stream<Integer> s1 = Stream.of(9,99,999,9999,99999);
		s1.forEach(System.out::println);
		
		Double[] d= {10.1,10.2,10.3,10.4,10.5};
		Stream<Double> s2 = Stream.of(d);
		s2.forEach(System.out::println);

	}

}
