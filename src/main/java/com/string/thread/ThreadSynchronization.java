package com.string.thread;

import lombok.SneakyThrows;

/**
 * @author Naveen K Wodeyar
 * @date 13-Jul-2024
 */
public class ThreadSynchronization implements Runnable{

	@SneakyThrows
	@Override
	public void run() {
		int counter = 0;
		synchronized (this) {	
			for (int i = 0; i < 4; i++) {
				counter++;
	//			System.out.println(Thread.currentThread().getName()+","+i);
			}
		}
		System.out.println("Counter after increment="+counter);
	}

	public static void main(String[] args) {
    ThreadSynchronization thread = new ThreadSynchronization();
        
        Thread th1 = new Thread(thread, "Thread-1");
        Thread th2 = new Thread(thread, "Thread-2");
        
        th1.start();
        th2.start();
		
	}

}
