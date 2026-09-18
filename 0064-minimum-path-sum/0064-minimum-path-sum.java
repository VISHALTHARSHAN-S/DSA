class Solution {
    public int minPathSum(int[][] grid) {
       int n=grid.length,m=grid[0].length;
       int [] prev =new int[m];
       for(int i=0;i<n;i++)
       {
        int [] curr=new int [m];
        for(int j=0;j<m;j++)
        {
            if(i==0&&j==0)curr[j]=grid[i][j];
            else
                {
                    int left=(j>0)?curr[j-1]+grid[i][j]:Integer.MAX_VALUE;
                    int up=(i>0)?prev[j]+grid[i][j]:Integer.MAX_VALUE;
                    curr[j]=Math.min(left,up);
                }

        }
        prev=curr;
       }
       return prev[m-1];
    }
}