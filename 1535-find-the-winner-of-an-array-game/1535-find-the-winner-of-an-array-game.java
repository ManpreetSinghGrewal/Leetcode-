class Solution {
    public int getWinner(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        int maxElement = arr[0];
        for(int i =1;i<arr.length;i++){
            maxElement = Math.max(maxElement,arr[i]);
            q.add(arr[i]);
        }
        int curr = arr[0];
        int winstreak = 0;
        while(!q.isEmpty()){
            int opp = q.remove();
            if(curr >opp){
                q.add(opp);
                winstreak++;
            }
            else{
                q.add(curr);
                curr = opp;
                winstreak = 1;
            }
            if(winstreak == k || curr == maxElement){
                return curr;
            }
        }
        return -1;
    }
}