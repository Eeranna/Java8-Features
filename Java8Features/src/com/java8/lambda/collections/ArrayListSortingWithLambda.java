package com.java8.lambda.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingWithLambda {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);
		list.add(18);
		System.out.println("Before Sorting:"+list);
		Collections.sort(list);
		System.out.println("After Sorting Ascending order:"+list);
		Collections.sort(list,(i1,i2) -> (i1>i2)?-1:(i1<i2)? 1:0);
		System.out.println("Descending order soring:"+list);
	}

}