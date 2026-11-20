class Solution {
    private void bfs(int i,boolean[] visited,int[][]adj){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visited[i] = true;
        while(q.size()>0){
            int front = q.poll();
            for(int j =0;j<visited.length;j++){
                if(adj[front][j] ==1 && visited[j] == false){
                    q.offer(j);
                    visited[j] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] adj) {
        int count = 0;
        int n = adj.length;
        boolean[] visited = new boolean[n];
        for(int i =0;i<n;i++){
            if(!visited[i]){
                bfs(i,visited,adj);
                count++;
            }
        }
        return count;
    }


}