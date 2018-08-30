package com.java8.lambda.collections;

import java.util.TreeMap;

public class TreeMapSortingWithLambda {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(600, "Eeranna");
		tm.put(200, "Sunny");
		tm.put(300, "Bunny");
		tm.put(400, "Chinny");
		tm.put(700, "Binny");
		tm.put(150, "Teju");
		System.out.println(tm);//By default natural sorting order
		
		TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		tm1.put(600, "Eeranna");
		tm1.put(200, "Sunny");
		tm1.put(300, "Bunny");
		tm1.put(400, "Chinny");
		tm1.put(700, "Binny");
		tm1.put(150, "Teju");
		System.out.println(tm1);
	}

}
