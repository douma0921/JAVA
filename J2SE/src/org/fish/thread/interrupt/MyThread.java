package org.fish.thread.interrupt;

public class MyThread extends Thread{
 @Override
 public void run(){
	 super.run();
	 for(int i=0;i<5000;i++){
		 System.out.println("i="+i);
	 }
 }
}
