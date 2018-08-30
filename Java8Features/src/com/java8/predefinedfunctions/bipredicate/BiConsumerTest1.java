package com.java8.predefinedfunctions.bipredicate;

import java.util.function.BiConsumer;

public class BiConsumerTest1 {

	public static void main(String[] args) {

		BiConsumer<String,String> c =(s1,s2)->System.out.println(s1+s2);
		c.accept("Eeranna", "Software");

	}

}
