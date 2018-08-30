package com.java8.timeapi.dateapi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdTest1 {

	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);
		
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
		ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
		ZonedDateTime id1 = ZonedDateTime.now(zoneid1);  
		ZonedDateTime id2 = ZonedDateTime.now(zoneid2);  
		System.out.println(id1);  
		System.out.println(id2);  
		System.out.println(id1.isBefore(id2));    
	}

}
