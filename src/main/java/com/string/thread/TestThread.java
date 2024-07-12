package com.string.thread;

import lombok.SneakyThrows;

/**
 * @author Naveen K Wodeyar
 * @date 12-Jul-2024
 */
public class TestThread extends Thread{

	@SneakyThrows
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(1000);
		System.out.println(Thread.getAllStackTraces());
	}

	public static void main(String[] args) {
		
		Thread thread = new TestThread();
				thread.start();
	}

}
