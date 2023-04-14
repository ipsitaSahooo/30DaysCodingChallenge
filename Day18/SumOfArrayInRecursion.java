public class SumOfArrayInRecursion 
{
	static int sum=0;
	public static int sumofarray(int a[],int n)
	{
		
		if(n==0)
		return 0;
		
		else
		sum+=a[n-1];
		
		sumofarray(a,n-1);
		return sum;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,4,7,5,2};
		System.out.println(sumofarray(a,5));


	}

}

