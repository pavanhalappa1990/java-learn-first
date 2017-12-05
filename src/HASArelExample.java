class Address 
{  
	String city,state,country;  
  
	public Address(String city, String state, String country) 
	{  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  
  
}  
class HASArelExample {  
	int id;  
	String name;  
	Address address;  
  
	HASArelExample(int id, String name,Address address) 
	{  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
  
	void display()
	{  
		System.out.println(id+" "+name+" "+address.city+" "+address.state+" "+address.country);  
	}  
  
	public static void main(String[] args) 
	{  
		Address a1=new Address("gzb","UP","india");  
		Address a2=new Address("gno","UP","india");  
		  
		HASArelExample e=new HASArelExample(111,"varun",a1);  
		HASArelExample e2=new HASArelExample(112,"arun",a2);  
      
		e.display();  
		e2.display();  
      
	}  
}  
