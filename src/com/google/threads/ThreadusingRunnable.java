package com.google.threads;

import java.io.InterruptedIOException;

class Thread2 implements Runnable
{

	@Override
	public synchronized  void run() {// synchronization prevents the overlapping the  execution of the threads 
		
		//System.out.println("thread is running:");
		//System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());		}
	}
}
public class ThreadusingRunnable {

	public static void main(String[] args) {
		Thread2 obj=new Thread2();
		Thread t=new Thread(obj);
		t.setName("1st Thread");
		t.start();
		try
		{
			t.join();
			System.out.println("join in thread 1");
		}
		catch( InterruptedException e)
		{
			e.printStackTrace();
		}
		Thread t1=new Thread(obj);
		t1.setName("2nd thread");
		t1.start();
		Thread t2=new Thread(obj);
		t2.setName("3nd thread");
		t2.start();
		try
		{
			t2.join();
			System.out.println("join in thread 2");
		}
		catch( InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	}

}


