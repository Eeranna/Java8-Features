package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest3 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Pavan");
		l1.add("Ravi Teja");
		l1.add("Chiranjeevi");
		l1.add("Nagarjuna");
		l1.add("Venkatesh");
		l1.add("Balakrishna");
		System.out.println(l1);
		List<String> l2 = l1.stream().filter(s->s.length()>=9).collect(Collectors.toList());
		System.out.println(l2);
		List<String> l3 = l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l3);
		
		long count = l1.stream().filter(s->s.length()>=9).count();
		System.out.println("The length >=9 is: "+count);
	}

}
