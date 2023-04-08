class Solution {
    public int countPrimes(int n) 
    {
        long c=0;
        boolean prime[]=new boolean[n];

        for(long i=2;i<n;i++)
        {
            if(prime[(int)i])
            continue;
            else
            c++;

            for(long j=i*i;j<n;j+=i)
            {
                prime[(int)j]=true;
            }
        }

        return (int)c;
       
    }
}
