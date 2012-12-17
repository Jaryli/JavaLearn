package com.learn.basic;

/* 学习主题：抽象方法和抽象类
 * 当多个类中出现相同功能，但功能主体不同，
 * 这时可以进行向上抽取，这时，只抽取功能定义，不抽取功能主体。
 * 
 * 抽象：模糊的，看不懂的。
 * 抽象类的特点：
 * 1，抽象方法一定定义在抽象类中。
 * 2，抽象方法和抽象类都必须被abstract关键字修饰
 * 3，抽象类不可以用new 创建对象。因为调用抽象方法没意义。
 * 4，抽象类中的方法要被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用。
 * 5,如果子类是复写了一部分父类的抽象方法，那该子类仍是抽象类。
 * */
abstract class Student
{
	abstract void study();
	//abstract void study1();
}

class BaseStudent extends Student
{
   void study()
	{
		System.out.println("base study");
	}
}

class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}
}

class AbstractDemoi {

	public static void main(String[] args)
	{
		BaseStudent bs=new BaseStudent();
		bs.study();
	}
}
