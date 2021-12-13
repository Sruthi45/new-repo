package com.sorting.code;

import java.util.Comparator;

public class MyComparatorDescending implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		
	return (arg0<arg1)?1:(arg0>arg1)?-1:0;	
		
	}

}
