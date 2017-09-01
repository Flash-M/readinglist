package com.manning;

public class MyThread extends Thread {
	private Service service;

	public MyThread(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
