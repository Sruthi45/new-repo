package com.jodapi.code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class JodaAPI {

	public static void main(String[] args) {
		ZoneId usZone = ZoneId.of("America/Cuiaba");
		ZonedDateTime currentDate = ZonedDateTime.now(usZone);
		System.out.println(currentDate);
		LocalTime currentTime = LocalTime.now();
		LocalDate SruthiBday = LocalDate.of(1991, Month.MARCH, 8);
		//Period p = Period.between(SruthiBday, currentDate);
		ZoneId myZone = ZoneId.systemDefault();
		//ZoneId usZone = ZoneId.of("America/Cuiaba");
		ZonedDateTime timeNow = ZonedDateTime.now(usZone);
		ZonedDateTime timeNow2 = ZonedDateTime.now();
		System.out.println("\n R u my time" +timeNow2);
		System.out.println("\n Zoned timing"+timeNow);
		Set<String> myZOnes =ZoneId.getAvailableZoneIds();
		
		for(String s : myZOnes) {
			System.out.println(s);
		}
		System.out.println("My current Zone is"+ myZone);
		//Same operations can be performed for LocalDateTime
		LocalDateTime dt = LocalDateTime.now();
		LocalDateTime st=dt.plusMonths(8);
		int date = currentDate.getDayOfMonth();
		int month = currentDate.getMonthValue();
		int year = currentDate.getYear();
		int hours = currentTime.getHour();
		int minutes = currentTime.getMinute();
		int seconds = currentTime.getSecond();
		int nano = currentTime.getNano();
		System.out.printf("%d-%d-%d",date,month,year);
		System.out.println("\n");
		System.out.printf("%d:%d:%d:%d",hours,minutes,seconds,nano);
		System.out.println("\n");
		System.out.println(currentTime);
		System.out.println("\n");
		System.out.println(st);
		System.out.println("\n");
	//	System.out.println(p.getYears()+"--"+p.getMonths()+"--"+p.getDays());

	}

}
