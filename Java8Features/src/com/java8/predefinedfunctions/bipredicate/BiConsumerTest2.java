package com.java8.predefinedfunctions.bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Emp{
	
	String name;
	double salary;
	public Emp(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
}

public class BiConsumerTest2 {

	public static void main(String[] args) {
		BiFunction<String,Double,Emp> f = (name,salary)->new Emp(name,salary);
		List<Emp> list = new ArrayList<Emp>();
		list.add(f.apply("Sunny", 1000.0));
		list.add(f.apply("Bunny", 2000.0));
		list.add(f.apply("Chinny",3000.0));
		list.add(f.apply("Pinny", 4000.0));
		
		BiConsumer<Emp,Double> c =(e,increment)->e.salary=e.salary+increment;
		for(Emp e: list) {
			c.accept(e, 500.0);
		}
		for(Emp e1: list) {
			System.out.println("Employee Name: "+e1.name);
			System.out.println("Employee Salary: "+e1.salary);
			System.out.println();
		}
	}

}
