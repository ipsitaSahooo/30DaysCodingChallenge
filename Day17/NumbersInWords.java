package codeStudio;
import java.util.*;
public class NumbersInWords 
{
	public static void sayDigit(int n,String arr[])
	{
		if(n==0)
			return;
		int digit=n%10;
		n/=10;
		
		sayDigit(n,arr);
		System.out.print(arr[digit]+" ");
		
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int n=s.nextInt();
		
		sayDigit(n,arr);
		
	}

}
