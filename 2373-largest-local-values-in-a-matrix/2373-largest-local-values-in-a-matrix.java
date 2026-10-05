class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m =  grid.length;
        int res[][] = new int[m-2][m-2];
        for(int i= 0;i<m-2;i++){
            for(int j = 0;j<m-2;j++){
                int mv = 0;
                for(int r = i;r<i+3;r++){
                    for(int c = j ;c<j+3;c++){
                        mv = Math.max(grid[r][c],mv);
                    }
                }
                res[i][j] = mv;
            }
            
        }
        return res;

    }
}