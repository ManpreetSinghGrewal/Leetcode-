class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        Queue <Integer> q = new ArrayDeque();
        for(int i = 0;i<n;i++){
            q.offer(i);
        }
        int time = 0;
        while(!q.isEmpty()){
            int idx = q.poll();
            tickets[idx]--;
            time++;
            if(tickets[idx] == 0 && idx == k)return time;
            if(tickets[idx] >0)q.offer(idx);
        }
        return time;
    }
}