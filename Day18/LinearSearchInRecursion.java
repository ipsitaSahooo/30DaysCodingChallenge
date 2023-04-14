public class LinearSearchInRecursion 
{
	public static boolean search(int a[],int n,int key)
	{
		boolean ans;
		if(n==0)
			return false;
		
		if(key==a[n-1])
			return true;
		else
			ans=search(a,n-1,key);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,4,7,5,2};
		System.out.println(search(a,5,9));


	}

}

