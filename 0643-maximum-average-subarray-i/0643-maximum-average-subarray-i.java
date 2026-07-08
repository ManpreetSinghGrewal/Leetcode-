class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;

        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum = sum;
        for(int i =k;i<len;i++){
            sum = sum - nums[i-k] + nums[i];
            maxSum= Math.max(sum,maxSum);
        }


        
        return (double) maxSum / k;
    }
}