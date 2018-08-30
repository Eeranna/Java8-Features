package com.java8.predefinedfunctional.primitivetypes;

import java.util.function.Function;
import java.util.function.IntFunction;

public class IntFunctionTest1 {

	public static void main(String[] args) {
		
		System.out.println("=========Using Function===========");
		Function<Integer,Integer> f1=i->i*i;
		System.out.println(f1.apply(8));
		
		System.out.println("=========Using IntFunction===========");
		IntFunction<Integer> f2 = i->i*i;
		System.out.println(f2.apply(5));

	}

}
