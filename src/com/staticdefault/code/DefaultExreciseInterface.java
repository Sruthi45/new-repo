package com.staticdefault.code;

interface DefaultExerciseInterface{
	static void deduct() {}
	
	default void Interfacemethod() {
		System.out.println("In the interface method");

	}
}