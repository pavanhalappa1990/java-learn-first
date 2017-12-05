package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
	int id;
	String name;
	int age;
	Student(int i, String n, int a)
	{
		id=i;
		name=n;
		age=a;
	}
}

public class userDefinedClassObjects {

	public static void main(String[] args) 
	{
		Student s1 = new Student(221,"jeremy", 21);
		Student s2 = new Student(222,"james", 21);
		Student s3 = new Student(223,"richard", 21);
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		for(Student s:al)
		{
			System.out.println(s.id+""+s.name+""+s.age);
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.id+""+st.name+""+st.age);
		}

	}
}

