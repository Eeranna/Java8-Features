package com.java8.lambda.functionalinterfaces;
interface Interf4{
	public void add(int a,int b);
}
class Demo1 implements Interf4{
	public void add(int a,int b) {
		System.out.println("sum is:"+(a+b));
	}
}
public class AddWithouLambda {
	public static void main(String[] args) {
		Interf4 i = new Demo1();
		i.add(10, 20);
		i.add(100, 200);
	}
}
