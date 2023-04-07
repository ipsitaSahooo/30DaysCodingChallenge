class Solution {
    public void rotate(int[][] matrix) 
    {
        //transpose the matrix
        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse the matrix
        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix[0].length/2;j++)
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=t;
            }
        }
    }
}
