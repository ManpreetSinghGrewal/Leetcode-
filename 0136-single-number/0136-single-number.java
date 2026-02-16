class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int c:nums){
            ans ^= c;
        }
        return ans;
    }
}