class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int dp[][] =  new int [m][n];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == '0'){
                    dp[i][j]= 0;
                }
                if(i == 0 || j == 0){
                    if(matrix[i][j] == '0'){
                    dp[i][j]= 0;
                    }if(matrix[i][j] == '1'){
                    dp[i][j]= 1;
                    }
                }
            }
        }
        for(int i =1;i<m;i++){
            for(int j =1;j<n;j++){
                if(matrix[i][j] =='1'){
                dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1] ,dp[i-1][j-1]))+1;
                }
                else{
                    dp[i][j] =0;
                }
            }
        }
        int res =0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                res = Math.max(res,dp[i][j]);
            }
        }
        return res*res;
    }
}