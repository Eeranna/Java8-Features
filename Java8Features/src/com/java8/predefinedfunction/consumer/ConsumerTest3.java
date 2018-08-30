package com.java8.predefinedfunction.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}

public class ConsumerTest3 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		populate(list);
		Predicate<Student> p = s->s.marks>=60;
		Function<Student,String> f = s -> {
			int marks = s.marks;
			if(marks>=80) {
				return "A[Distinction]";
			}else if(marks>=60) {
				return "B[Firstclass]";
			}else if(marks>=50) {
				return "C[Secondclass]";
			}else if(marks>=35) {
				return "D[Passed]";
			}else {
				return "E[Failed]";
			}
		};
		Consumer<Student> c = s->{
			System.out.println("name: "+s.name);
			System.out.println("makrs: "+s.marks);
			System.out.println("Grade: "+f.apply(s));
			System.out.println();
		};
		for(Student s:list) {
			if(p.test(s)) {
				c.accept(s);
			}
		}

	}
	public static void populate(List<Student> list) {
		list.add(new Student("Prabhas",89));
		list.add(new Student("Salman",98));
		list.add(new Student("Ameer",67));
		list.add(new Student("Ameer",58));
		list.add(new Student("Ranveer",45));
	}

}
