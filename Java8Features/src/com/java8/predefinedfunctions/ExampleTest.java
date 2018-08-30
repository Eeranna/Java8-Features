package com.java8.predefinedfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	String designation;
	double salary;
	String city;
	public Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	public String toString() {
		//return name+","+designation+","+salary+","+city;
		String s = String.format("(%s,%s,%.2f,%s)",name,designation,salary,city);
		return s;
	}
	public boolean equals(Object obj) {
		Employee e =(Employee)obj;
		if(name.equals(e.name)&&designation.equals(e.designation)&&salary==e.salary &&city.equals(e.city)) {
			return true;
		}else {
			return false;
		}
	}
}

public class ExampleTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Eeranna","SoftwareEngineer",60000,"Banglore"));
		list.add(new Employee("Vasu","SoftwareEngineer",70000,"Hyderabad"));
		System.out.println(list);
		
		System.out.println("=======Creating Pupulate method============");
		List<Employee> list1 = new ArrayList<Employee>();
		pupulate(list1);
		System.out.println("=======Pring Pupulate method list data============");
		System.out.println(list1);
		
		System.out.println("=============Predicate to find the manager===========");
		Predicate<Employee> p1 = emp ->emp.designation.equals("Manager");
		display(p1,list1);
		
		System.out.println("=============Predicate to find who are working in Banglore===========");
		Predicate<Employee> p2 = emp ->emp.city.equals("Banglore");
		display(p2,list1);
		
		System.out.println("=============Predicate to find who has salary less than 20k===========");
		Predicate<Employee> p3 = emp ->emp.salary<20000;
		display(p3,list1);
		
		System.out.println("=============Predicate to find all managers from Banglore for pink slip===========");
		display(p1.and(p2),list1);
		
		System.out.println("=============Predicate to find all employees who are manager or salary lessthan 20k===========");
		display(p1.or(p3),list1);
		
		System.out.println("=============Predicate to find all employees who are not managers===========");
		display(p1.negate(),list1);
		
		System.out.println("=============Checking isEqual() method===========");
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Eeranna","CEO",30000,"Banglore"));
		
		Employee e1 = new Employee("Eeranna","CEO",30000,"Banglore");
		Employee e2 = new Employee("Rakesh","Software",40000,"Hyd");
		System.out.println(isCEO.test(e1));
		System.out.println(isCEO.test(e2));
		
	}
	public static void display(Predicate<Employee> p, List<Employee> list) {
		for(Employee e: list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
	}
	
	public static void pupulate(List<Employee> list1) {
		list1.add(new Employee("Eeranna","SoftwareEngineer",60000,"Banglore"));
		list1.add(new Employee("Vasu","SoftwareEngineer",70000,"Hyderabad"));
		list1.add(new Employee("Sajit","Manager",60000,"Banglore"));
		list1.add(new Employee("Geetha","Manager",15000,"Hyderabad"));
		list1.add(new Employee("Sanjoy","Manager",60000,"Banglore"));
		list1.add(new Employee("Srilatha","Manager",70000,"Hyderabad"));
		list1.add(new Employee("Eeranna","SoftwareEngineer",60000,"Banglore"));
		list1.add(new Employee("Raja","SoftwareEngineer",16000,"Hyderabad"));
		list1.add(new Employee("Ganta","Manager",60000,"Banglore"));
		list1.add(new Employee("Teju","SoftwareEngineer",19000,"Hyderabad"));
	}
}
