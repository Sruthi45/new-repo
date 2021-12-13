package com.sorting.code;

public class Student {
	
	int studentNumber;
	
private String studentName;

public int getStudentNumber() {
	return studentNumber;
}

public void setStudentNumber(int studentNumber) {
	this.studentNumber = studentNumber;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

@Override
public String toString() {
	return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + "]";
}

public Student(int studentNumber, String studentName) {
	super();
	this.studentNumber = studentNumber;
	this.studentName = studentName;
}
}
