package com.java8.lambda.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortingWithoutLambda {

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
		Collections.sort(list,new MyComparator());
		System.out.println("Descending order soring:"+list);
	}

}
class MyComparator implements Comparator<Integer>{
	
	public int compare(Integer i1, Integer i2) {
		/*if(i1>i2) {
			return -1;
		}else if(i1<i2) {
			return +1;
		}else {
			return 0;
		}*/
		return (i1>i2)?-1:(i1<i2)?+1:0;
	}
}
