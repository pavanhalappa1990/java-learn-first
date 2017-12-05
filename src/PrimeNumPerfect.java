import java.util.Scanner;

public class PrimeNumPerfect 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			boolean flag=true;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(i);
				System.out.println("\t");
			}
		}
		

	}

}
