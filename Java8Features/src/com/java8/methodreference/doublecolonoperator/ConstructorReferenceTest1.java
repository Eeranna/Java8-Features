package com.java8.methodreference.doublecolonoperator;

class Sample{
	Sample(){
		System.out.println("Sample constructor reference");
	}
}
interface Interf1{
	public Sample get();
}
public class ConstructorReferenceTest1 {

	public static void main(String[] args) {
		
		Interf1 i = Sample::new;
		Sample s = i.get();
	}

}
