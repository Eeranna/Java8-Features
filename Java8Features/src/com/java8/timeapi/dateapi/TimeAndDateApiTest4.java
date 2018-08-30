package com.java8.timeapi.dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class TimeAndDateApiTest4 {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.of(1995,Month.MAY,22, 12,45);
		System.out.println(date);
		
		System.out.println("AFter six months: "+date.plusMonths(6));
		System.out.println("Before six months: "+date.minusMonths(6));
		
		LocalDate birthday = LocalDate.of(1985, 06, 10);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Age is %d Years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathDay = LocalDate.of(1985+60, 06, 10);
		Period p1 = Period.between(today, deathDay);
		int years = p1.getYears();
		int months = p1.getMonths();
		int days = p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		System.out.printf("\nYou will be on the earth only %d Years %d Months %d Days ..",years,months,days);
	}

}
