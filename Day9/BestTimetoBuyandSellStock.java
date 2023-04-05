class Solution {
    public int maxProfit(int[] a) 
    {
        int min=Integer.MAX_VALUE;
        int ans=0;
        int profit=0;
        

        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            min= a[i];

            profit=a[i]-min;
            if(ans<profit)
            ans=profit;
        }
        return ans;

    }
}
