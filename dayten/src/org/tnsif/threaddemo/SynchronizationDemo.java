package org.tnsif.threaddemo;


//program to demonstrate on synchronized method
public class SynchronizationDemo {
	
	synchronized void print(int num) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
		}
	}

}
		//Thread 1 ******
class ThreadOne extends Thread
{
	SynchronizationDemo d;

	public ThreadOne(SynchronizationDemo d) 
	{
		super();
		this.d = d;
	}
	public void run()
	{
		try 
		{
			d.print(5);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
	}
}


	//Thread 2 ******
	class ThreadTwo extends Thread
{
	SynchronizationDemo d;
	
	public ThreadTwo(SynchronizationDemo d) 
	{
		super();
		this.d = d;
	}
	public void run()
	{
		try 
		{
			d.print(20);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);

		}
	}
}