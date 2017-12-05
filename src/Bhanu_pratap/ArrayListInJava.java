package Bhanu_pratap;

import java.util.*;

public class ArrayListInJava {

	public static void main(String[] args) 
	{
		List arraylist = new ArrayList<>();
		arraylist.add(10);
		arraylist.add(11.7);
		arraylist.add(true);
		arraylist.add(-1);
		arraylist.add("asus");
		
		System.out.println(arraylist);
		List<Integer> arraylist1 = new ArrayList<Integer>();
		arraylist1.add(10);
		arraylist1.add(11);
		arraylist1.add(12);
		for(Integer i:arraylist1)
		{
			System.out.println(i);
		}
	}

}
