import java.util.Scanner;

public class PrimeNnum 
{

 public static void main(String[] args) 
 {

  int num,count;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter any number:");
  num = s.nextInt();

   for (int i = 1; i <= num; i++) 
   {
	   //System.out.print("value of i is :"+i);
	   count = 0;
  		for (int j = 2; j <= i / 2; j++) 
  		{
  				
  			//System.out.print("value of j is :"+j);
  			if (i % j == 0) 
  				{
  					count++;
  					break;
  				}
  		}

  		if (count == 0) 
  		{
  			System.out.println(i);
  		}
   }
 }
}
