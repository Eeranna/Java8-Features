package com.java8.predefinedfunctional.primitivetypes;

import java.util.function.IntConsumer;

public class IntConsumerTest {

	public static void main(String[] args) {
		
		IntConsumer c = i->System.out.println("The Squere root of "+i+" is: "+(i*i));	
		c.accept(21);
	}

}
