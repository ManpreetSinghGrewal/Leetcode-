class Solution {
    public int alternatingSum(int[] nums) {
        int e = 0;
        int o = 0;
        for(int i =0;i<nums.length;i =i+2){
            e+=nums[i];
        }
        for(int i =1;i<nums.length;i =i+2){
            o+=nums[i];
        }
        return e-o;

    }
}