package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTest4 {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();
		l1.add("A");
		l1.add("BB");
		l1.add("CCC");
		l1.stream().forEach(s->System.out.println(s));
		l1.stream().forEach(System.out::println);
	}

}
