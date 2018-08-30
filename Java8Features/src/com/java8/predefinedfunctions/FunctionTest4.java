package com.java8.predefinedfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Emp1{
	String name;
	double salary;
	public Emp1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return name+":"+salary;
	}
}

public class FunctionTest4 {

	public static void main(String[] args) {
		
		List<Emp1> list1 = new ArrayList<Emp1>();
		populate(list1);
		
		System.out.println("===================Emp Info Before Increment===================");
		System.out.println(list1);
		System.out.println("===================End========================");
		
		Predicate<Emp1> p = e -> e.salary<3500;
		Function<Emp1,Emp1> f = e -> {e.salary = e.salary+477;
									  return e;
									};
									
	    List<Emp1> list2 = new ArrayList<Emp1>();
	    for(Emp1 e:list1){
	    	if(p.test(e)){
	    		f.apply(e);
	    		list2.add(e);
	    	}
	    }
	    System.out.println("After icrement: "+list1);
		System.out.println("Whose salary incremented: "+list2);
	}
	public static void populate(List<Emp1> list1) {
		list1.add(new Emp1("Eeranna",5000));
		list1.add(new Emp1("Goverdan",10000));
		list1.add(new Emp1("Sanjoy",2000));
		list1.add(new Emp1("Raja",3000));
		list1.add(new Emp1("Tejas",1000));
		list1.add(new Emp1("Geetha",2000));
	}

}

