class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        int c=0;
        int arr[]=new int[n+m];
        for(int i=0;i<n;i++)
        {
            arr[i]=a[i];
        }
        for(int i=0;i<m;i++)
        {
            arr[i+n]=b[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            c++;
        }
        return c+1;
    }
}
