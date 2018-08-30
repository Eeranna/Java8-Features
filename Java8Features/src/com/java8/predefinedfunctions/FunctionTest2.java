package com.java8.predefinedfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionTest2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		populate(list);
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
		/*for(Student s:list) {
			System.out.println("**********************************");
			System.out.println("name: "+s.name);
			System.out.println("marks: "+s.marks);
			System.out.println("Grade of the student: "+f.apply(s));
			System.out.println("**********************************");
		}*/
		Predicate<Student> p = s -> s.marks>=60;
		for(Student s:list) {
			if(p.test(s)) {
				System.out.println("name: "+s.name);
				System.out.println("marks: "+s.marks);
				System.out.println("Grade of the student: "+f.apply(s));
				System.out.println("**********************************");
			}
		}
	}
	public static void populate(List<Student> list) {
		list.add(new Student("Tejas",100));
		list.add(new Student("Rakesh",75));
		list.add(new Student("Eeranna",65));
		list.add(new Student("Geetha",55));
		list.add(new Student("Veeru",45));
		list.add(new Student("Raja",25));
	}

}
