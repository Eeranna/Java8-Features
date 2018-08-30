package com.java8.predefinedfunction.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Movie{
	String name;
	String hero;
	String heroine;
	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
}

public class ConsumerTest2 {

	public static void main(String[] args) {
		List<Movie> list = new ArrayList<Movie>();
		populate(list);
		Consumer<Movie> c = m->{
			System.out.println("Movie Name: "+m.name);
			System.out.println("Movie Hero: "+m.hero);
			System.out.println("Movie Heroine: "+m.heroine);
			System.out.println("***************************");
		};
		for(Movie movie: list) {
			c.accept(movie);
		}
	}
	public static void populate(List<Movie> list) {
		list.add(new Movie("Bahubali","Prabhas","Anushka"));
		list.add(new Movie("Sulthan","Salman","Katrina"));
		list.add(new Movie("Lagan","Ameer","Rekha"));
		list.add(new Movie("Three Idiots","Ameer","Kareena"));
		list.add(new Movie("Sanju","Ranveer","Anushka Sharma"));
	}
}
