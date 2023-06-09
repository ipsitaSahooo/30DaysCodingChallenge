class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row=matrix.length;
        int col=matrix[0].length;

        int rowIndex=0;
        int colIndex=col-1;

        while(rowIndex<row && colIndex>=0)
        {
            int n=matrix[rowIndex][colIndex];
             if(n==target)
             return true;

             if(target > n)
             rowIndex++;
             else
             colIndex--;
        }
        return false;
    }
}
