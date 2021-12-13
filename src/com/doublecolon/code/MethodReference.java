package com.doublecolon.code;

public class MethodReference {

	public static void m2() {
		System.out.println("Just like Durga Soft");
	}
	public static void main(String[] args) {
		Interf i1 = MethodReference::m2;
        i1.m1();
	}

}
