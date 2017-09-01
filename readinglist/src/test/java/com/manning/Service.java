package com.manning;

public class Service {
	synchronized public void testMethod(){
		if (Thread.currentThread().getName().equals("a")) {
			while(true){
				if ((""+Math.random()).substring(0, 8).equals("0.123456")) {
					Integer.parseInt("a");
					
				}else {
					
					System.out.println("a");
				}
			}
			
		}else {
			System.out.println("b");
		}
	}
}
