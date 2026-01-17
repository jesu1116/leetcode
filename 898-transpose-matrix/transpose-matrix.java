class Solution {
    public int[][] transpose(int[][] matrix)
     {
        int m=matrix.length;
        int n=matrix[0].length;
        int [][] result=new int [n][m];
        for(int i=0;i<m;i++)
        {
            // int n=matrix[i].length;
            // int [][] result=new int [n][m];
            for(int j=0;j<n;j++)
            {
                result[j][i]=matrix[i][j];
                
            }
            // return matrix[j][i];
        }
        return result;

    }
}