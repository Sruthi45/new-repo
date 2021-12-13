package com.sorting.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeAddtionalAndSorting {

	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1,"Deepika"));
		studentList.add(new Student(10,"Deepa"));
		studentList.add(new Student(100,"Vasu"));
		studentList.add(new Student(1001,"Shiny"));
		studentList.add(new Student(2007,"Sruthi"));
		System.out.println(studentList);
		Collections.sort(studentList,(e1,e2)->(e1.studentNumber<e2.studentNumber)?1:(e1.studentNumber>e2.studentNumber)?-1:0);
		System.out.println("Descending Order");
		System.out.println(studentList);
	}

}
