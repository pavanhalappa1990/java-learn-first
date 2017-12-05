
public class ConstructorOverload 
{
	//student example
	int id;
	String name;
	int age;
	ConstructorOverload(int i, String n)
	{
		id=i;
		name=n;
	}
	ConstructorOverload(int i, String n, int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) 
	{
		ConstructorOverload co = new ConstructorOverload(212,"james");
		ConstructorOverload co1 = new ConstructorOverload(213,"ben", 21);
		co.display();
		co1.display();
	}

}
