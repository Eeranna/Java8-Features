package com.java8.timeapi.dateapi;

import java.time.LocalDateTime;

public class TimeAndDateApiTest3 {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		int h = date.getHour();
		int m = date.getMinute();
		int s = date.getSecond();
		int n = date.getNano();
		
		System.out.printf("%n%d-%d-%d", dd,mm,yyyy);
		System.out.printf("%n%d:%d:%d:%d", h,m,s,n);
	}

}
