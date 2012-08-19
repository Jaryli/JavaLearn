package com.learn.basic;
/**
* 学习主题：多线程中的同步函数。
* 关键字：synchronized的使用
* demo：两个储户分别往银行存钱300，存3次，每次存100。
*/
class Bank
{
	private int sum;
	Object obj=new Object();
	public synchronized void add(int n)//方式二
	{
		//synchronized(obj) //方式一
		//{
		sum=sum+n;
	try{ Thread.sleep(10);}catch(Exception e){}
		System.out.println("sum="+sum);
		//}
	}
}

class Cas implements Runnable
{
	private Bank b=new Bank();
	public void run()
	{
	for(int x=0;x<3;x++)
		{
	b.add(100);
	}
	}
}

class BankDemo 
{
	public static void main(String[] args) 
	{
		Cas c=new Cas();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		System.out.println("Hello World!");
	}
}