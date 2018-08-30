package com.java8.lambda.functionalinterfaces;
interface Interf5{
	public void add(int a,int b);
}
public class AddWithLambda {
	public static void main(String[] args) {
		Interf5 i = (a,b) -> System.out.println("The sum is:"+(a+b));;
		i.add(10, 20);
		i.add(100, 200);
	}
}
