package com.learn.basic.model;

public class testInnerClass
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		C c=new C();
		c.funA(new IA(){
			public void doSomething()
			{
				System.out.println(".....asdf.....asdfasdf");
			}
		});
	}

}
