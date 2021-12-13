package com.sorting.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Sort {
	

	public static void main(String[] args) {
		List<Integer> listOne = new ArrayList<Integer>();
		TreeSet<Integer>	treeList = new TreeSet<Integer>((arg0,arg1)->(arg0<arg1)?1:(arg0>arg1)?-1:0);
		treeList.add(90);
		treeList.add(100);
		treeList.add(80);
		treeList.add(50);
		listOne.add(10);
		listOne.add(50);
		listOne.add(70);
		listOne.add(90);
		listOne.add(40);
	   //	Collections.sort(listOne,new MyComparatorDescending());
		// Sorting Java 8 
		
		Collections.sort(listOne,(arg0,arg1)->(arg0<arg1)?1:(arg0>arg1)?-1:0);
	for(Integer i:listOne) {
		
		System.out.println(i);
	}
	System.out.println("---------------");
for(Integer i:treeList) {
		
		System.out.println(i);
	}

	}

}
