package com.java8.timeapi.dateapi;

import java.time.Year;
import java.util.Scanner;

public class YearTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Etner Year Number");
		int enterYear = sc.nextInt();
		Year y = Year.of(enterYear);
		if(y.isLeap()) {
			System.out.printf("%d Year is Leap year ",enterYear);
		}else {
			System.out.printf("%d Year is not Leap year ",enterYear);
		}
	}

}
