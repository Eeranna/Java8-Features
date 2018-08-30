package com.java8.predefinedfunctional.primitivetypes;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class IntToDoubleTest {

	public static void main(String[] args) {
		
		System.out.println("============Using Function==========");
		Function<Integer,Double> f1= i->Math.sqrt(i);
		System.out.println(f1.apply(64));
		
		System.out.println("============Using IntToDoubleFunction==========");
		IntToDoubleFunction f2 = i->Math.sqrt(i);
		System.out.println(f2.applyAsDouble(5));
	}

}
