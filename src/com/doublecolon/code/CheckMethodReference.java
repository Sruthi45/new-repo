package com.doublecolon.code;

public class CheckMethodReference {
	
	public void m3() {
		System.out.println("Let's check Sruthi now");
	}

public static void main(String[] args) {
	Runnable r = new CheckMethodReference()::m3;
	Thread t1 = new Thread(r);
	t1.start();
	for(int i=0;i<=10;i++) {
		System.out.println("Main Thread");
	}
	
	
}
	
}
