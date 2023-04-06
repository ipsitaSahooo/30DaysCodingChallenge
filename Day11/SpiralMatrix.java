class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> res = new ArrayList<>();

        int startrow=0;
        int endrow= matrix.length-1;
        int startcol=0;
        int endcol= matrix[0].length-1;

       
       
        if(matrix.length == 0 || matrix[0].length == 0) 
            return res;
        
        while(startrow<=endrow && startcol<=endcol){
          
          
            for(int j=startcol; j<=endcol; j++){
                res.add(matrix[startrow][j]);
            }
         
         
            for(int i=startrow+1; i<=endrow; i++){
                res.add(matrix[i][endcol]);
            }
      
      
            for(int j=endcol-1; j>=startcol; j--){
             
             
                if(startrow==endrow){
                    break;
                }
                res.add(matrix[endrow][j]);
            }
        
        
            for(int i=endrow-1; i>=startrow+1; i--)
            {
          
                if(startcol==endcol){
                    break;
                }
                res.add(matrix[i][startcol]);
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        return res;
        
    }
}
