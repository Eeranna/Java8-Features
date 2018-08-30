package com.java8.predefinedfunctional.primitivetypes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class ObjDoubleConsumerTest {

	public static void main(String[] args) {
		
		ObjDoubleConsumer<Employee> c=(e,increment)->e.salary=e.salary+increment;
		List<Employee> list = new ArrayList<Employee>();
		populate(list);
		for(Employee e:list) {
			c.accept(e, 500.0);
		}
		for(Employee e1:list) {
			System.out.println("Employee name: "+e1.name);
			System.out.println("Employee salary: "+e1.salary);
			System.out.println();
		}
	}

	private static void populate(List<Employee> list) {
		list.add(new Employee("Eeranna",1000.0));
		list.add(new Employee("Sunny",2000.0));
		list.add(new Employee("Bunny",3000.0));
		list.add(new Employee("Chinny",4000.0));
	}

}
