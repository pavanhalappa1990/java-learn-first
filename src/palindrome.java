
import java.util.Scanner;
public class palindrome
{
    public static void main(String args[])
    {
        int n, m, a = 0,x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            System.out.println(x);
            a = a * 10 + x;
            System.out.println(a);
            n = n / 10;
            System.out.println(n);
            System.out.println("----------------");
        }
        System.out.println("reverse is "+a);
        if(a == m)
        {
            System.out.println("Given number "+m+" is Palindrome");
        }
        else
        {
            System.out.println("Given number "+m+" is Not Palindrome");
        }
    }
}