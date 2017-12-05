class Student
{  
	int rollno;  
	String name;  
	 void insertRecord(int r, String n)
	 {  
		  rollno=r;  
		  name=n;  
	 }  
	 void displayInformation()
	 {
		 System.out.println(rollno+" "+name);
	 }  
}  
class ObjInvokeByMethod
{  
	public static void main(String args[])
	{  
		  Student s1=new Student();  
		  Student s2=new Student();  
		  s1.insertRecord(111,"Karan");  
		  s1.insertRecord(222,"Aryan");  
		  s1.insertRecord(333,"");
		  s1.displayInformation();  
		  s1.displayInformation();  
	}  
}  