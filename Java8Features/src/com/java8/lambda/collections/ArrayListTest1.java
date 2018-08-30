package com.java8.lambda.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListTest1 {
	
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("Sunny");
		list.add("Bunny");
		list.add("Chinny");
		list.add("Sunny");
		System.out.println(list);//1.Duplicates are allowed,2.Insertion order is preserved
		Set<String> set = new HashSet<String>();
		set.add("Sunny");
		set.add("Bunny");
		set.add("Chinny");
		set.add("Sunny");
		System.out.println(set);//1.Duplicates are not allowed,2.Insertion order is not preserved
		Map<String,String> map = new HashMap<String,String>();
		map.put("A","Apple");
		map.put("Z", "Zebra");
		map.put("Eeranna", "Java");
		map.put("B", "Bananana");
		map.put("T", "Tiger");
		System.out.println(map);
	}

}
