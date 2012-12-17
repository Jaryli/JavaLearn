package com.learn.thread;

public class FirstThread extends Thread
{
    @Override
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread()+" FirstThread i="+i);
		}
	}
	long minPrime;
	public FirstThread(long minPrime)
	{
          this.minPrime=minPrime;
	}

}
