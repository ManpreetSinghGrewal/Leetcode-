class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int mi = Integer.MIN_VALUE;
        for(int j= k;j<n;j++){
            mi = Math.max(mi,nums[j-k]);
            int cs = mi+nums[j];
            res = Math.max(cs,res);
        }
        return res;
    }
}