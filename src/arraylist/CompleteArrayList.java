package arraylist;

import java.util.ArrayList;

class Book
{
	int bookid, quantity;
	String author,name,publisher;
	Book(int bid,int qty,String aut,String n,String pub)
	{
		bookid=bid;
		quantity=qty;
		author=aut;
		name=n;
		publisher=pub;
		
	}
}

public class CompleteArrayList {

	public static void main(String[] args) 
	{
		Book b1 = new Book(1211,2,"sumithaba das","UNIX","expert-publications");
		Book b2 = new Book(1212,2,"norton","data communicatons","McGraw Hill");
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		for(Book prt:al)
		{
			System.out.println(prt.bookid+"\t"+prt.quantity+"\t"+prt.author+"\t"+prt.name+"\t"+prt.publisher);
		}
		

	}

}
