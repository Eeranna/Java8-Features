package com.java8.predefinedfunction.consumer;

import java.util.function.Consumer;

class Movie1{
	
	String name;
	String result;
	public Movie1(String name, String result) {
		this.name = name;
		this.result = result;
	}
}

public class ConsumerTest4 {

	public static void main(String[] args) {
		
		Consumer<Movie1> c1 = m->System.out.println("Movie "+m.name+" is ready to release");
		Consumer<Movie1> c2 = m->System.out.println("Movie "+m.name+" is "+m.result);
		Consumer<Movie1> c3 = m->System.out.println("Movie "+m.name+" is storing in database");
		
		Consumer<Movie1> chainedC = c1.andThen(c2).andThen(c3);
		
		Movie1 m1 = new Movie1("Bhahubali","Super Hit");
		chainedC.accept(m1);
		
		Movie1 m2 = new Movie1("Spider","Flap");
		chainedC.accept(m2);
	}

}
