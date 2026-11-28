class Solution {
    public void dfs(int i,int j,int m ,int n,int[][] grid){
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 1) return;
        grid[i][j] = 1;
        dfs(i + 1, j, m, n, grid);
        dfs(i - 1, j, m, n, grid);
        dfs(i, j + 1, m, n, grid);
        dfs(i, j - 1, m, n, grid);
    }
    public int closedIsland(int[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i<m;i++){
            if(grid[i][0] == 0)dfs(i,0,m,n,grid);
            if(grid[i][n-1]==0)dfs(i,n-1,m,n,grid);
        }
        for(int j = 0;j<n;j++){
            if(grid[0][j] == 0)dfs(0,j,m,n,grid);
            if(grid[m-1][j]==0)dfs(m-1,j,m,n,grid);
        }

        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == 0){
                    res++;
                    dfs(i,j,m,n,
                    grid);
                }
            }
        }
        return res;

    }
}