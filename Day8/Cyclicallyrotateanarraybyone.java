class Compute 
{
    public void reverse(int a[],int i,int j)
    {
        while(i<j)
        {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
        i++;
        j--;
        }
    }
    public void rotate(int arr[], int n)
    {
        reverse(arr,0,n-1);
        reverse(arr,1,n-1);
    }
}
