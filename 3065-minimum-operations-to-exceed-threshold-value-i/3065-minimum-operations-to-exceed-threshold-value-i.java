class Solution {
    public int minOperations(int[] nums, int k) {
        int res= 0;
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length && nums[i] < k){
            res++;
            i++;
        }
        return res;
    }
}