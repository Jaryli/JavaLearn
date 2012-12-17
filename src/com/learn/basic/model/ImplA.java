package com.learn.basic.model;

public class ImplA implements IA
{
	int i;

	public ImplA()
	{
		// TODO Auto-generated constructor stub
	}

	class B
	{
	   	int j;
		public int Add()
		{
			return i + j;
		}
	}
	public void doSomething()
	{
		System.out.println("do Something！！！！");
	}
}
