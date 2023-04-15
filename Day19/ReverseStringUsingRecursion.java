public class ReverseStringUsingRecursion 
{
	static String str="";
	public static String reverse(String s,int n)
	{
		
		if(n==0)
			return "";
		else
		{
			str+=s.charAt(n-1);
			reverse(s,n-1);
		}
		
		return str;
	}

	public static void main(String[] args) 
	{
		String s="ipsita";
		System.out.println(reverse(s,s.length()));
		

	}

}

