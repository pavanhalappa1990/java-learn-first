
public class matchformatString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			String[]str={"www.google.com", "https://www.google.com"};
			for(int i=0; i<str.length; i++)
			{
				if(str[i].matches("www\\.(.+)"))
				{
					System.out.println(str[i]+":starts with www");
				}
				else
				{
					System.out.println(str[i]+":doesnt starts with www");
				}
					
			}
	}

}
