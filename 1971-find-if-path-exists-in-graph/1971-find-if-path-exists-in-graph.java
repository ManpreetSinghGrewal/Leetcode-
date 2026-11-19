import java.util.*;

class Solution {
    private boolean dfs(Map<Integer,List<Integer>> graph, int src, int des, boolean[] vis,int n) {
        if(src == des)return true;
        vis[src] = true;
        for(int neighbor: graph.getOrDefault(src, Collections.emptyList())){
            if(!vis[neighbor]){
            if( dfs(graph,neighbor,des,vis,n)){
                return true;
            }
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> graph = new HashMap<>();

        for(int edge[] :edges){
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, value->new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, value -> new ArrayList<>()).add(u);
        
        }

        boolean[] vis = new boolean[n];
        return dfs(graph, source, destination, vis,n);
    }
}