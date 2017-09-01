package com.manning;

public class Test {
	public static void main(String[] args) {
		
		Service service = new Service();
		
		MyThread threadA = new MyThread(service);
		threadA.setName("a");
		MyThread threadB = new MyThread(service);
		threadB.setName("b");
		threadB.start();
		threadA.start();
	}
}
