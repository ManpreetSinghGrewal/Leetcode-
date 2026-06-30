class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
    ArrayList<Integer> res = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int sr = 0;
        int er = n-1;
        int sc = 0;
        int ec = m-1;
        
        while(sr<=er && sc<=ec){
            for(int i = sc;i<=ec;i++){
                res.add(mat[sr][i]);
            }
            sr++;
            for(int j = sr;j<=er;j++){
                res.add(mat[j][ec]);
            }
            ec--;
            if(sr<=er){for(int i = ec;i>=sc;i--){
                res.add(mat[er][i]);
            }
            er--;
            }
            if(sc<=ec){for(int j =er;j>=sr;j--){
                res.add(mat[j][sc]);
            }
            sc++;}
        }
        
        return res;
        
    }
}