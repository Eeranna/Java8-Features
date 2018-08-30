package com.java8.predefinedfunctional.primitivetypes;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		
		System.out.println("===========Using BiFunction============");
		BiFunction<String,String,String> f1 = (s1,s2)->s1+s2;
		System.out.println(f1.apply("Eeranna", "Soft"));
		
		System.out.println("===========Using BinaryOperator============");
		BinaryOperator<String> f2 = (s1,s2)->s1+s2;
		System.out.println(f2.apply("Tejas", "Soft"));
		
		System.out.println("===========Using BinaryOperator============");
		BinaryOperator<Integer> f3 = (i1,i2)->i1+i2;
		System.out.println(f3.apply(11,21));
		System.out.println(f3.apply(101,201));
		
		System.out.println("===========Using IntBinaryOperator============");
		IntBinaryOperator f4 = (i1,i2)->i1+i2;
		System.out.println(f4.applyAsInt(10,20));
		System.out.println(f4.applyAsInt(100,200));
	}

}
