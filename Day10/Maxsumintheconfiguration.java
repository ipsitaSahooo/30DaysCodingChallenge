class GfG
{
    
    int max_sum(int a[], int n)
    {
       int sum=0;
       int val=0;
       for(int i=0;i<a.length;i++)
       {
           sum+=a[i];
           val+=i*a[i];
       }
       int ans=val;
       for(int i=1;i<a.length;i++)
       {
           int nextval= val-(sum-a[i-1])+(a[i-1]*(n-1));
           val=nextval;
           ans=Math.max(ans,nextval);
           
       }
       return ans;
    }	
}

