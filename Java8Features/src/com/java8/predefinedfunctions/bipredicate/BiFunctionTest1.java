package com.java8.predefinedfunctions.bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Student {
	String name;
	int rollno;
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
}

public class BiFunctionTest1 {

	public static void main(String[] args) {
		
		System.out.println("================Using BiFunction================");
		BiFunction<Integer,Integer,Integer> f1 = (a,b)->a*b;
		System.out.println(f1.apply(10, 20));
		System.out.println(f1.apply(100,200));
		System.out.println("===To write a stuent object to apply name and rollno as two input values=====");
		BiFunction<String,Integer,Student> f2 = (name,rollno)->new Student(name,rollno);
		List<Student> list = new ArrayList<Student>();
		list.add(f2.apply("Eeranna", 100));
		list.add(f2.apply("Tejas", 200));
		list.add(f2.apply("Geetha", 100));
		list.add(f2.apply("Mokshitha", 500));
		for(Student s: list) {
			System.out.println("name: "+s.name);
			System.out.println("rollno: "+s.rollno);
			System.out.println();
		}
	}

}
