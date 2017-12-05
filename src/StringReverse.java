import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string:");
		String str = scan.nextLine();
		char[] strArray = str.toCharArray();
		for(int i=strArray.length-1;i>=0;i--)
		{
			System.out.println(strArray[i]);
		}
		
		// TODO Auto-generated method stub
	}

}
