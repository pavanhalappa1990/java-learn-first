package Bhanu_pratap;

import java.util.*;

public class ArrayListInJava2 {

	public static void main(String[] args) 
	{
		
		List<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(11);
		arraylist.add(12);
		/*for(Integer i:arraylist1)
		{
			System.out.println(i);
		}*/
		System.out.println(arraylist);
		
		List<Integer> arraylist1 = new ArrayList<Integer>();
		arraylist1.add(101);
		arraylist1.add(111);
		arraylist1.add(12);
		
		//arraylist.addAll(arraylist1);
		//System.out.println(arraylist);
		
		//arraylist.addAll(2, arraylist1);
		//System.out.println(arraylist);
		
		//arraylist1.add(2, 131);
		//System.out.println(arraylist1);
		//arraylist.removeAll(arraylist1);
		//System.out.println(arraylist);
		
		//arraylist.remove(2);
		//System.out.println(arraylist);
		arraylist.removeAll(arraylist1);
		System.out.println(arraylist);
		
	}

}
