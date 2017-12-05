package AccessSpecifiersTrialProgs;
import Bpackage.b;

public class ProgA 
{
	public void publicmeth()
	{
		System.out.println("this is pub method");
	}
	private void privatemeth()
	{
		System.out.println("this is private method");
	}
	void meth()
	{
		System.out.println("this is default method");
	}
	protected void protectmeth()
	{
		System.out.println("this is protected method");
	}

	public static void main(String[] args) 
	{
		ProgA a=new ProgA();
		System.out.println("inside the class");
		a.publicmeth();
		a.privatemeth();
		a.meth();
		a.protectmeth();
	}

}
