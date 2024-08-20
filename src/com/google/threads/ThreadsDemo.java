package com.google.threads;

class Thread1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"Thread is executed");
			try {
				Thread.sleep(MAX_PRIORITY);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread());
		System.out.println("customable thread is running:");
		
		System.out.println(currentThread().getName());
	}
}
public class ThreadsDemo {

	public static void main(String[] args) {
		Thread1 t=new Thread1();
		t.start();
		t.setName("A thread");
		System.out.println(t.currentThread().getName());
		Thread1 t1=new Thread1();
		t.setPriority(5);
		System.out.println(t.getName());
		t1.start();

	}

}
