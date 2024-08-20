package com.google.threads;

class CustomThread extends Thread
{
	@Override
	public synchronized void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class SynchronizationExample {

	public static void main(String[] args) {
		
		CustomThread t1=new CustomThread();
		CustomThread t2=new CustomThread();
		CustomThread t3=new CustomThread();
		CustomThread t4=new CustomThread();
		t1.start();
		t2.start();
		t3.start();

	}

}
