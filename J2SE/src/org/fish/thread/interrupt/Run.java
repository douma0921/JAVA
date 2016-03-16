package org.fish.thread.interrupt;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.sleep(2000);
			thread.interrupt();
			System.out.println("is stop ? 1:"+thread.interrupted());
			System.out.println("is stop ? 2:"+thread.interrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
