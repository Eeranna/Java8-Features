package com.java8.predefinedfunctions;

import java.util.function.Function;

public class FunctionTest5 {

	public static void main(String[] args) {
		
		Function<String,String> f1 = s->s.toUpperCase();
		Function<String,String> f2 = s->s.substring(0, 9);
		System.out.println(f1.apply("Aiswaryaabhi"));
		System.out.println(f2.apply("Aiswaryaabhi"));
		System.out.println(f1.andThen(f2).apply("Aiswaryaabhi"));
		System.out.println(f1.compose(f2).apply("Aiswaryaabhi"));
		
		Function<Integer,Integer> f3 = i -> i+i;
		Function<Integer,Integer> f4 = i -> i*i*i;
		System.out.println(f3.andThen(f4).apply(2));
		System.out.println(f3.compose(f4).apply(2));
		
		Function<String,String> f = Function.identity();
		String s2 = f.apply("veeru");
		System.out.println(s2);
	}

}
