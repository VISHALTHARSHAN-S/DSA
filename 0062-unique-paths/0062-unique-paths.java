class Solution {
    public int uniquePaths(int m, int n) {
        int dp[]=new int[n];
        for(int i=0;i<m;i++)
        {  int temp[]=new int [n];
            for(int j=0;j<n;j++)
            {
                if(i==0&&j==0) temp[j]=1;
                else{
                    if(i==0 || j==0) temp[j]=1;
                    else temp[j]=dp[j]+temp[j-1];
                }
            }
            dp=temp;
        }
        return dp[n-1];
    }
}