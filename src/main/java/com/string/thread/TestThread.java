package com.string.thread;
/**
 * @author Naveen K Wodeyar
 * @date 12-Jul-2024
 */
public class TestThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread.yield();
		System.out.println(Thread.getAllStackTraces());
	}

	public static void main(String[] args) {
		Runnable runnable = ()->{
			for (int i = 0; i < Thread.NORM_PRIORITY; i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		 
		Thread t = new Thread(runnable);
				t.start();
				System.out.println(Thread.holdsLock(t));
	}

}
