package com.java8.predefinedfunctional.primitivetypes;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UneryOperatorTest {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> f1 = i->i*i;
		System.out.println(f1.apply(10));
		
		IntUnaryOperator f2 = i->i*i;
		System.out.println(f2.applyAsInt(20));
	}

}
