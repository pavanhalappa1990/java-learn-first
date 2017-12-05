package arraylist;

import java.util.*;
import java.util.Iterator;
import java.util.List;

public class listIteratorInterface {

	public static void main(String[] args) 
	{
		List<String> lis = new ArrayList<String>();
		lis.add("eenie");
		lis.add("meenie");
		lis.add("mynie");
		lis.add("mo");
		ListIterator<String> it = lis.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}

	}

}
