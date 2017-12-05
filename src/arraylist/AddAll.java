package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAll {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("eenie");
		al.add("meenie");
		al.add("mynie");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("mo");
		al.addAll(al2);
		for(String s:al)
		{
			System.out.println(s);
		}
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
