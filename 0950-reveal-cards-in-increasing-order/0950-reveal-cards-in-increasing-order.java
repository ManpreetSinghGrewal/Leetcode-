class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> dq = new LinkedList<>();
        Arrays.sort(deck);
        int n = deck.length;
        for(int i = n-1;i>=0;i--){
            if(!dq.isEmpty()){
                dq.offerFirst(dq.pollLast());
            }
            dq.offerFirst(deck[i]);
        }
        int res[] = new int[n];
        for(int i =0;i<n;i++){
            res[i] = dq.poll();
        } 
        return res;
    }
}