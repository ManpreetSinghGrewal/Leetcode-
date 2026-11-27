class Solution {
    private void dfs(int[][] isConnected,int curr , boolean[] vis,int n){
        vis[curr] = true;
        for(int i = 0;i<n;i++){
            if(isConnected[curr][i] == 1 && !vis[i]){
                dfs(isConnected,i,vis,n);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean vis[] = new boolean[n];
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                cnt++;
                dfs(isConnected,i,vis,n);
            }
            
        }
        return cnt;
    }
}