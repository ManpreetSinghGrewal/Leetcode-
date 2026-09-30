class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res = 1;
        int n = nums.length;
        int c = 1;
        for(int i =1;i<n;i++){
            if(nums[i] > nums[i-1]){
                c++;
            }
            else{     
                c = 1;
            }
            res = Math.max(res,c);
        }
        return res;
    }
}