package com.java8.predefinedfunctional.primitivetypes;

import java.util.function.IntSupplier;

public class IntSupplierTest {

	public static void main(String[] args) {
		
		/*Supplier<Integer> s = ()->(int)(Math.random()*10);
		String otp = "";
		for(int i=0;i<6;i++) {
			otp=otp+s.get();
		}
		System.out.println(otp);*/
		
		IntSupplier s = ()->(int)(Math.random()*10);
		String otp = "";
		for(int i=0;i<6;i++) {
			otp=otp+s.getAsInt();
		}
		System.out.println(otp);
		
	}
}
