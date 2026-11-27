class Solution {
    public static boolean isSafe(int newi,int newj,int m,int n){
        if(newi <0 || newj <0 )return false;
        if(newi>=m || newj>=n)return false;
        return true;  
    }
    private void dfs(char[][] grid,boolean[][] vis, int i ,int j,int m,int n){
        vis[i][j] = true;
        int[][] dirs = {{0,-1},{0,1},{-1,0},{1,0}};
        for(int k = 0;k<4;k++){
            int newi = i + dirs[k][0];
            int newj = j + dirs[k][1];
            if(isSafe(newi,newj,m,n) && grid[newi][newj] == '1' && !vis[newi][newj]){
                dfs(grid,vis,newi,newj,m,n);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;
        boolean vis[][] = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    cnt++;
                    dfs(grid,vis,i,j,m,n);
                }
            }
        }
        return cnt;
    }
}