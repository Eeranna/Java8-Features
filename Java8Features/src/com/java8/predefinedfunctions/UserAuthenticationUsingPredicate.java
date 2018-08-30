package com.java8.predefinedfunctions;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	String uname;
	String pwd;
	public User(String uname,String pwd) {
		this.uname = uname;
		this.pwd = pwd;
	}
}

public class UserAuthenticationUsingPredicate {

	public static void main(String[] args) {
		Predicate<User> p = user -> user.uname.equals("veeru") && user.pwd.equals("java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter username");
		String username = sc.next();
		System.out.println("Please enter password");
		String password = sc.next();
		User user = new User(username,password);
		if(p.test(user)) {
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User Please login again!!!");
		}
		sc.close();
	}

}
