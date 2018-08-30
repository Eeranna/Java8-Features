package com.java8.predefinedfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Emp{
	String name;
	double salary;
	public Emp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return name+":"+salary;
	}
}

public class FunctionTest3 {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		populate(list);
		System.out.println("===================Emp Info Before Increment===================");
		System.out.println(list);
		System.out.println("===================End========================");
		Function<List<Emp>,Double> f = emp -> {
			double totalSal = 0;
			for(Emp e:list) {
				totalSal = totalSal+e.salary;
			}
			return totalSal;
		};
		System.out.println("Total employees salary: "+f.apply(list));
	}
	public static void populate(List<Emp> list) {
		list.add(new Emp("Eeranna",2500));
		list.add(new Emp("Goverdan",3000));
		list.add(new Emp("Sanjoy",2000));
		list.add(new Emp("Raja",3000));
		list.add(new Emp("Tejas",1000));
	}

}
