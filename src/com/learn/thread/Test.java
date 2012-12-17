package com.learn.thread;

public class Test
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
        FirstThread ft=new FirstThread(143);
        ft.start();
        RunableImp imp=new RunableImp();
        Thread td=new Thread(imp);
        td.setPriority(Thread.NORM_PRIORITY);
        System.out.println("......."+td.getPriority());
        td.start();
        for(int i=0;i<100;i++)
        {
        	System.out.println("Main:---"+i);
        }
	}

}
