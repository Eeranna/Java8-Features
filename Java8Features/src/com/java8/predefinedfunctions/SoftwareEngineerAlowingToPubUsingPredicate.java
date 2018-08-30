package com.java8.predefinedfunctions;

import java.util.function.Predicate;

class SoftwareEngineer{
	String name;
	int age;
	boolean isHavingGF;
	public SoftwareEngineer(String name,int age,boolean isHavingGF) {
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}
	public String toString() {
		return name;
	}
}

public class SoftwareEngineerAlowingToPubUsingPredicate {

	public static void main(String[] args) {
		SoftwareEngineer[] list = { new SoftwareEngineer("Eeranna",32,true),
				new SoftwareEngineer("Raja",31,true),
				new SoftwareEngineer("Tejas",23,false),
				new SoftwareEngineer("Anil",39,false),
				new SoftwareEngineer("Sanjoy",40,true),
				new SoftwareEngineer("Bunny",17,true)};
		Predicate<SoftwareEngineer> allowed = se -> se.age>=18&&se.isHavingGF == true;
		System.out.println("The allowed members into the pub are:");
		for(SoftwareEngineer s: list) {
			if(allowed.test(s)) {
				System.out.println(s);
			}
		}
	}

}
