package com.java8.predefinedfunctional.primitivetypes;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ToIntFunctionTest1 {

	public static void main(String[] args) {
		
		System.out.println("============Using Function==========");
		Function<String,Integer> f1=s->s.length();
		System.out.println(f1.apply("Tejas"));

		System.out.println("============Using ToIntFunction==========");
		ToIntFunction<String> f2 = s->s.length();
		System.out.println(f2.applyAsInt("Eeranna"));

	}

}
