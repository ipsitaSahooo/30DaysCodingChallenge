import java.util.*;
public class Solutions {

	public static void swap(int ar[],int start,int end)
    {
            int t=ar[start];
            ar[start]=ar[end];
            ar[end]=t;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int st=0;
        int e=n-1;
        for(int i=0;i<n;i++)
        {
                if(st<=0)
                st++;
               
                else
                {
                swap(a,st,e);
                e--;
                }
        }
        
        for(int i:a)
        {
        	System.out.print(i+" ");
        }

	}

}
