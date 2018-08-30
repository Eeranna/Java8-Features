package com.java8.predefinedfunctions;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionUserAuthenticationTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Etner password");
		String pwd = sc.next();
		
		Function<String,String> f1 = s->s.substring(0,5);
		Function<String,String> f2 = s->s.toLowerCase();
		if(f1.andThen(f2).apply(username).equals("veeru") && pwd.equals("java")) {
			System.out.println("You are the valid user");
		}else {
			System.out.println("Invalid user!!!");
		}
	}

}
