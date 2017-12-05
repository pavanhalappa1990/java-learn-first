class Banks
{
	double rateofinterest()
	{
		return 0.0;
	}
}
class HDFC extends Banks
{
	double rateofinterest()
	{
		return 9.0;
	}
}
class ICIC extends Banks
{
	double rateofinterest()
	{
		return 8.0;
	}
}
class TestRuntimePoly
{
	public static void main(String args[])
	{
		Banks b; 
		b= new HDFC();
		System.out.println("rate of interest is \t"+b.rateofinterest());
		System.out.println("simple");
		b = new ICIC();
		System.out.println("rate of interest is \t"+b.rateofinterest());
		
	}
}