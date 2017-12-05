
public class defaultConstructor 
{
	int id;
	String name;
	void display()
	{
		System.out.println(id +" "+name);
	}

	public static void main(String[] args) 
	{
		
		defaultConstructor df = new defaultConstructor();
		df.display();
	}

}
