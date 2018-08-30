package com.java8.predefinedfunctions;

import java.util.function.Function;

public class FunctionTest1 {

	public static void main(String[] args) {
		
		Function<String,Integer> f1 = s -> s.length();
		System.out.println(f1.apply("Eeranna"));
		System.out.println(f1.apply("EerannaSoftware"));
		
		Function<Integer,Integer> f2 = i -> i*i;
		System.out.println("Square of given number is:"+f2.apply(10));
		System.out.println("Square of given number is:"+f2.apply(20));
		
		String str = " Tejas  Software  Engineer Solutions ";
		Function<String,String> f3 = s -> s.replaceAll(" ", "");
		System.out.println(f3.apply(str));
		
		System.out.println("To find a total number of spaces in given string");
		Function<String,Integer> f4 = s -> s.length()-s.replaceAll(" ", "").length();
		System.out.println(f4.apply(str));
	}

}
