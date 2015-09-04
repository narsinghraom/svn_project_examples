package narsingh;

public class StringFact 
{
	public void stringFact(String s1)
	{
		int len=s1.length();
		char[] ch=new char[50];
		for(int i=0;i<=len-1;i++)
		{
			ch[i]=s1.charAt(i);
		}  
		for(int i=0;i<=len-1;i++)
		{
			System.out.println(ch[i]);
		}
		
	}

	public static void main(String[] args) 
	{
	
		StringFact sf=new StringFact();
		sf.stringFact("chinna");

	}

}
