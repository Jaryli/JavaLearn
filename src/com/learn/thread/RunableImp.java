package com.learn.thread;

public class RunableImp implements Runnable
{

	@Override
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("------I="+i);
		}
	}
     
}
