package com.java8.lambda.collections;

import java.util.TreeSet;

public class TreeSetDemoWithLambda {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(20);
		treeSet.add(25);
		System.out.println(treeSet);//By default Ascending order 
		
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>((i1,i2) -> (i1>i2)?-1:(i1<i2)? 1:0);
		treeSet1.add(10);
		treeSet1.add(0);
		treeSet1.add(15);
		treeSet1.add(5);
		treeSet1.add(20);
		treeSet1.add(25);
		System.out.println(treeSet1);//Descending order
	}

}
