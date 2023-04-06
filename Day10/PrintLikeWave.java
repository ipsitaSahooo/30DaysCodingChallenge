import java.util.* ;
import java.io.*; 

public class Solution {
	public static int[] wavePrint(int arr[][], int nRows, int mCols) 
	{
		int a[]=new int[nRows*mCols];
		int c=0;
		for(int col=0;col<mCols;col++)
		{
			if((col%2)!=0)
			{
				for(int row=nRows-1;row>=0;row--)
				{
					a[c++]=arr[row][col];
				}
			}
			else
			{
				for(int row=0;row<nRows;row++)
				{
					a[c++]=arr[row][col];
				}
			}
		}
		return a;
	}
}



