class Solution {

    public int uniquePathsWithObstacles(int[][] arr) {

        int n = arr[0].length;
        int m = arr.length;

        int dp[] = new int[n];

        for (int i = 0; i < m; i++) {

            int temp[] = new int[n];

            for (int j = 0; j < n; j++) {

                if (arr[i][j] == 1) {
                    temp[j] = 0;
                }

                else if (i == 0 && j == 0) {
                    temp[j] = 1;
                }

                else {
                    int top = (i > 0) ? dp[j] : 0;
                    int left = (j > 0) ? temp[j - 1] : 0;

                    temp[j] = top + left;
                }
            }

            dp = temp;
        }

        return dp[n - 1];
    }
}