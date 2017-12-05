package linkedList;

import java.util.*;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		ll.add(2,"five");
		//ll.add("one");
		//ll.add("one");
		//ll.add("one");
		//String n = ll.getLast();
		//System.out.println(n);
		//int i = ll.size();
		//System.out.println(i);
		
		int i2 =  ll.indexOf("five");
		System.out.println(i2);
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		

	}

}
