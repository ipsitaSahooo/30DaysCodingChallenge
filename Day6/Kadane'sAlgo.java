public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) 
	{
		long sum=0;
        long maxSum=0;
		boolean f=false;

		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				f=true;
				break;
			}
		}

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum>maxSum)
            maxSum=sum;
            if(sum<0)
            sum=0;
        }
		if(f==false)
		return 0;
		else
        return maxSum;
	}

}
