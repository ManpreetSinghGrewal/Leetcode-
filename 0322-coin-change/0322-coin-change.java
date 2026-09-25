class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount <1){
            return 0;
        }
        int mincdp[] = new int[amount+1];

        for(int i =1;i<=amount;i++){
            mincdp[i] = Integer.MAX_VALUE;

            for(int c: coins){
                if(c <= i && mincdp[i-c] != Integer.MAX_VALUE ){
                    mincdp[i] = Math.min(mincdp[i],1+mincdp[i - c]);
                }
            }
        }
        if(mincdp[amount] == Integer.MAX_VALUE) return -1;
        return mincdp[amount];

    }
}