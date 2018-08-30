package com.java8.predefinedfunctional.primitivetypes;

import java.util.function.IntPredicate;

public class IntPredicateTest1 {

	public static void main(String[] args) {
		
		int[] x = {5,10,15,20,25,30,33,35,37,40};
		IntPredicate p = i -> i%2==0;
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println("Even number: "+x1);
			}
		}

	}

}
