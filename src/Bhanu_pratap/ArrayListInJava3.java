package Bhanu_pratap;

import java.util.*;

public class ArrayListInJava3 {

	public static void main(String[] args) 
	{
		List<Object> arraylist = new ArrayList<Object>();
		arraylist.add(4);
		arraylist.add(6);
		arraylist.add(true);
		arraylist.add(5.9);
		System.out.println(arraylist);
		
		/*List<Object> arraylist1 = new ArrayList<Object>();	//created for contains all method
		arraylist1.add(4);
		arraylist1.add(6);									
		arraylist1.add(true);
		arraylist1.add(5.9);
		System.out.println(arraylist); */
		
		List<Integer> arraylist1 = new ArrayList<Integer>();
		arraylist1.add(4);
		arraylist1.add(4);
		arraylist1.add(6);
		arraylist1.add(8); 
		
		//arraylist.retainAll(arraylist1);// retains similar occurrance of elements in both arraylist and removes others.
		//System.out.println(arraylist.size());
		//System.out.println(arraylist.get(1));
		//System.out.println(arraylist.contains(400));
		System.out.println(arraylist.containsAll(arraylist1));
		System.out.println(arraylist);
		
		
		
		
	}

}
