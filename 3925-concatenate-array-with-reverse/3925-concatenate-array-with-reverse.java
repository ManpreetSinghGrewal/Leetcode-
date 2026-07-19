class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[] = new int[nums.length*2];
        int p =0;
        for(int i=0;i<nums.length;i++){
            ans[p++] = nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[p++] = nums[i];
        }
        return ans;
    }
}