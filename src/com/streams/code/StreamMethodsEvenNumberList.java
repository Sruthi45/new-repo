package com.streams.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsEvenNumberList {
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		ArrayList<Integer> multipliedList = new ArrayList<Integer>();
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(21);
		l1.add(90);
		Stream s = l1.stream();
		resultList = (ArrayList<Integer>) l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		multipliedList = (ArrayList<Integer>) l1.stream().map(i->i*9).collect(Collectors.toList());
		int minVal = (int) l1.stream().map(i->i*9).sorted().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(multipliedList);
		System.out.println(minVal);
		System.out.println(resultList);
		
		List<String> mainList = new ArrayList<String>();
		mainList.add("Sruthi");
		mainList.add("Vaishnavi");
		mainList.add("Harini");
		mainList.add("Anika");
		ArrayList<String> upperCasedList = 
	(ArrayList<String>) mainList.stream().map(i->i.toUpperCase()).
	sorted((i1,i2)->- i1.compareTo(i2)).collect(Collectors.toList());
		
	
		ArrayList<String> arrayList = (ArrayList<String>) mainList.stream().map(i->i.toUpperCase()).
				sorted((i1,i2)->(i1.length()>i2.length())?-1:(i1.length()<i2.length())?1:0).collect(Collectors.toList());
		ArrayList<String> sortedList= arrayList;
		ArrayList<String> upperCasedList1 = sortedList;
		System.out.println("The uppercased list is ");
		System.out.println(upperCasedList);
		int count = (int) mainList.stream().count();
		System.out.println(count);
		long count_ = mainList.stream().filter(i->i.length()>6).count();
		System.out.println(count_);
		System.out.println(upperCasedList1);
		

	}

}
