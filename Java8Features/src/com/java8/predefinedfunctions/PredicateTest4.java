package com.java8.predefinedfunctions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest4 {

	public static void main(String[] args) {
		/*String[] names = {"Sunny","Kajol","Kareena","Mallika","Katrina"};
		Predicate<String> startsWithK=s->s.charAt(0)=="K";
		System.out.println("The names starts with K are...");
		for(String s:names) {
			if(startsWithK.test(s)) {
				System.out.println(s);
			}
		}*/
		String[] names = {"Sunny","",null,"Mallika","Katrina","",null,"Kareena"};
		Predicate<String> p = s -> s!=null && s.length()!=0;
		ArrayList<String> list = new ArrayList<String>();
		for(String s:names) {
			if(p.test(s)) {
				list.add(s);
			}
		}
		System.out.println("Valid string is:"+list);
	}

}
