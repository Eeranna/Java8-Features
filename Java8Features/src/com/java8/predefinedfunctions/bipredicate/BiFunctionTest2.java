package com.java8.predefinedfunctions.bipredicate;

import java.util.function.BiFunction;

class Employee{
	
	int eno;
	String ename;
	double dailyWage;
	double totalSalary;

	public Employee(int eno, String ename, double dailyWage, double totalSalary) {
		this.eno = eno;
		this.ename = ename;
		this.dailyWage = dailyWage;
		this.totalSalary = totalSalary;
	}
}
class TimeSheet{
	int eno;
	int days;
	public TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}

public class BiFunctionTest2 {
	public static void main(String[] args) {
		
		BiFunction<Employee,TimeSheet,Double> f1=(e,t)->e.dailyWage * t.days;
		BiFunction<Employee,TimeSheet,Double> f2=(e,t)->e.totalSalary / t.days;
		Employee e = new Employee(101,"Eeranna",1500,62000);
		TimeSheet t = new TimeSheet(101,22);
		System.out.println("Employee Monthly Salary: "+(f1.apply(e, t)));
		System.out.println("Employee daily wage "+(f2.apply(e, t)));
		
		/*BiFunction<Employee,TimeSheet,Double> f2=(e1,t1)->e1.totalSalary / t1.days;
		Employee e1 = new Employee(101,"Eeranna",1500,63000);
		TimeSheet t1 = new TimeSheet(101,22);
		System.out.println("Employee daily wage "+(f2.apply(e1, t1)));*/
	}
}
