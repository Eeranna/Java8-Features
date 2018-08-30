package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0);
		l1.add(5);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		l1.add(30);
		l1.add(35);
		System.out.println(l1);
		//without stream()
		/*List<Integer> l2 = new ArrayList<Integer>();
		for(Integer i1:l1) {
			l2.add(i1*2);
		}
		System.out.println(l2);*/
		
		//with stream()
		List<Integer> l2 = l1.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l2);
	}

}
