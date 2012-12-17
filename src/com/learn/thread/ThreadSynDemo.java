package com.learn.thread;

public class ThreadSynDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		MyThread mythread=new MyThread();
		//共用一个线程体
		Thread td1=new Thread(mythread);
		Thread td2=new Thread(mythread);
		//每个线程都有自己的名字，通过setName方法设置。也可以通过getName来获取名字
		td1.setName("线程1：");
		td2.setName("线程2----：");
		td1.start();
		td2.start();

	}

}
