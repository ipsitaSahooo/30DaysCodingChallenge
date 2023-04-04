public class LargestRowSum 
{
	public static void MaxColSum(int a[][],int row,int col)
	{
		int max=Integer.MIN_VALUE;
		int rowindex=-1;
		for(int i=0;i<row;i++)
		{
			int sum=0;
			for(int j=0;j<col;j++)
			{
				sum+=a[j][i];
			}
			if(sum>max)
			{
				max=sum;
				rowindex=i;
			}
		}
		System.out.println(max+" "+rowindex);
		
	}

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		MaxColSum(a,3,3);

	}
}

