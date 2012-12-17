package com.learn.basic;

import java.io.IOException;

/**
 * Runtime 本身无构造函数，但是有个静态的getRuntime()方法，可以返回一个Runtime对象。 该类使用的是单例设计模式。
 * 
 * @author Jary
 * 
 */
public class RunTimeDemo
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		Runtime r = Runtime.getRuntime();
		r.exec("D:\\Program Files\\Tencent\\QQ\\Bin\\qq.exe");
	}

}
