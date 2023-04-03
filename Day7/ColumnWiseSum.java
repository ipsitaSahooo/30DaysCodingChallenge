public class ColumnWiseSum {

	public static void ColSum(int a[][],int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			int sum=0;
			for(int j=0;j<col;j++)
			{
				sum+=a[j][i];
			}
			System.out.print(sum+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		ColSum(a,3,3);

	}

}
