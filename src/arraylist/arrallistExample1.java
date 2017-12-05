package arraylist;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class arrallistExample1 {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("martin");
		al.add("james");
		al.add("ricky");
		al.add("jeremy");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("\n");
		for(String val:al)
		{
			System.out.println(val);
			//System.out.println("\n");
		}
	}

}
