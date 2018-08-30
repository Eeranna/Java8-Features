package com.java8.predefinedfunction.supplier;

import java.util.function.Supplier;

public class SupplierRandomPassword {

	public static void main(String[] args) {
		// 1. Length should be 8 characters
		// 2. 2,4,6,8 places should be digits
		// 3. 1,3,5,7 places should be upper case and special characters
		
		Supplier<String> s = () -> {
			Supplier<Integer> d  = ()->(int)(Math.random()*10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#@$";
			Supplier<Character> c = ()->symbols.charAt((int)(Math.random()*29));
			String pwd = "";
			for(int i=1;i<8;i++) {
				if(i%2==0) {
					pwd = pwd+d.get();
				}else {
					pwd = pwd+c.get();
				}
			}
			return pwd;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
