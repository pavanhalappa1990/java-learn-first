class Emp
{
	String name;
	String desgn;
	void EmpDetails()
	{
		System.out.println("emp name is :"+name+"->designation is:"+desgn);
	}
}
class tester extends Emp
{
	tester(String n, String d)
	{
		name=n;
		desgn=d;
	}
	void test()
	{
		System.out.println("tests code");
	}
}
class developer extends Emp
{
	developer(String n,String d)
	{
		name=n;
		desgn=d;
	}
	void develop()
	{
		System.out.println("develops code");
	}
}
public class hierarchicalInheritance 
{

	public static void main(String[] args) 
	{
		tester t= new tester("pavan","QA tester");
		developer d = new developer("imdad","developer");
		t.EmpDetails();
		d.EmpDetails();

	}

}
