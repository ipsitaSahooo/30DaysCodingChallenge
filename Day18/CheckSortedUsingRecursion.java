public class CheckSortedUsingRecursion 
{
	public static boolean sorted(int a[],int n)
	{
		boolean ans;
		if(n==0 || n==1)
			return true;
		
		if(a[n-2]>a[n-1])
			return false;
		else
			 ans=sorted(a,n-1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,4,7,5,2};
		System.out.println(sorted(a,5));

	}

}

