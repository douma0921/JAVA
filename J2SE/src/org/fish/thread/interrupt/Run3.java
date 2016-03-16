package org.fish.thread.interrupt;

public class Run3 {
	public static void main(String[] args) {
		try {
		MyThread thread = new MyThread();
		thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("is stop 1 ?:"+thread.isInterrupted());
			System.out.println("is stop 2 ?:"+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
