class Solution {
    public int max(int[] nums){
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            ans = Math.max(ans,nums[i]);
        }
        return ans;
    }
    public int minMoves(int[] nums) {
        int res = 0;
        int tm = max(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<tm){
                res += tm-nums[i];
            }
        }
        return res;
    }
}