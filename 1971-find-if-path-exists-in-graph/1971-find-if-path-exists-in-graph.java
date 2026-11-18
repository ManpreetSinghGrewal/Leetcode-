import java.util.*;

class Solution {
    private boolean dfs(List<List<Integer>> graph, int src, int des, boolean[] vis) {
        if (src == des) return true;
        vis[src] = true;
        
        for (int neighbor : graph.get(src)) {
            if (!vis[neighbor]) {
                if (dfs(graph, neighbor, des, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Step 1: Build the adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        // Step 2: Run DFS to find the path
        boolean[] vis = new boolean[n];
        return dfs(graph, source, destination, vis);
    }
}