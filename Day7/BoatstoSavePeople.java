class Solution {
    public int numRescueBoats(int[] ar, int limit) 
    {
        Arrays.sort(ar);
        int n=ar.length;
        int s=0;
        int e=n-1;
        int sum=0;
        int boat=0;
        while(s<=e)
        {
            sum=ar[s]+ar[e];
            if(sum<=limit)
            {
                boat++;
                e--;
                s++;
            }
            else
            {
                boat++;
                e--;
            }
        }
        return boat;
        
      
    }
}
