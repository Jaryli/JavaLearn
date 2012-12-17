package com.learn.thread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		HashMap<String,String> hasmap=new HashMap<String,String>();
		Map<String,String> map=hasmap;
		map.put("1", "A");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		System.out.println(set.size());
		Iterator<String> it = set.iterator();
		try
		{
			boolean bl = it.hasNext();
			if (bl)
			{
				String s = it.next();
				System.out.println(s);
			}
		} catch (Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(map.get("2"));
	}

}
