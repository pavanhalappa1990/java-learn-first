class Employee
{  
	float salary=40000;  
}  
class ISAExample extends Employee
{  
	 int bonus=10000; 
//}
//class ISAExample
//{
	 public static void main(String args[])
	 {  
		 ISAExample p=new ISAExample();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
}  