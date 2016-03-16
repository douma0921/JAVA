package org.fish.thread.interrupt;

public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("is stop 1 ?:" + Thread.interrupted());
		System.out.println("is stop 2 ?:" + Thread.interrupted());
		System.out.println("end");
	}
}
