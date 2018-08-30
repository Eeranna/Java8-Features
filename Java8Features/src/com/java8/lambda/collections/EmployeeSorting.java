package com.java8.lambda.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorting {

	int eno;
	String ename;
	EmployeeSorting(int eno,String ename){
		this.eno = eno;
		this.ename = ename;
	}
	public String toString(){
		return eno+":"+ename;
	}
	public static void main(String[] args) {
		List<EmployeeSorting> list = new ArrayList<EmployeeSorting>();
		list.add(new EmployeeSorting(600,"Eeranna"));
		list.add(new EmployeeSorting(200,"Tejas"));
		list.add(new EmployeeSorting(400,"Geetha"));
		list.add(new EmployeeSorting(100,"Bunny"));
		list.add(new EmployeeSorting(500,"Chinny"));
		list.add(new EmployeeSorting(800,"Sunny"));
		System.out.println("Before Soring: "+list);
		Collections.sort(list,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println("Ascending order Soring: "+list);
		Collections.sort(list,(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		System.out.println("Descending order Soring: "+list);
	}
}
