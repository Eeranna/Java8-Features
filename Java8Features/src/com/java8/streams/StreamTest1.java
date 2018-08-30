package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {

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
		//without stream()
		/*List<Integer> l2 = new ArrayList<Integer>();
		for(Integer i1:l1) {
			if(i1%2==0) {
				l2.add(i1);
			}
		}
		System.out.println(l2);*/
		
		//with stream()
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers are: "+l2);
		
		//with stream() default natural sorting order
		List<Integer> l3 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println("Default natural sorting order: "+l3);
		
		//with stream() customized sorting order
		List<Integer> l4 = l1.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Customized sorting order: "+l4);
		
		//with stream() to find minimum value
		Integer min = l1.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum value: "+min);
		
		//with stream() to find maximum value
		Integer max = l1.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Maximum value: "+max);
	}

}
