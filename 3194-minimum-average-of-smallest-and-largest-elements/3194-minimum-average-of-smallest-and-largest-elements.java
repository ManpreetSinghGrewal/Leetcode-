class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        int j = nums.length-1;
        double res = Double.MAX_VALUE;
        while(i<j){
            double ans = (nums[i] + nums[j]) / 2.0;
            res = Math.min(res,ans);
            i++;
            j--;
        }
        return res;
    }
}