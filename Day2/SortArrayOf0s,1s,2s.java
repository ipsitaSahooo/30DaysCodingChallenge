class Solution
{
    public static void swap(int a[],int i,int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void sort012(int a[], int n)
    {
        // code here 
        int s=0;
        int e=n-1;
        int mid=0;
        
        while(mid<=e)
        {
            if(a[mid]==0)
            {
                swap(a,s,mid);
                s++;
                mid++;
            }
            else if(a[mid]==2)
            {
                swap(a,mid,e);
                e--;
            }
            else
            mid++;
        }
        
    }
}
