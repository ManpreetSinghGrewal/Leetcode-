class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length ==1){
            return nums[0] *1.0000;
        }
        int i =0;
        int j = k;
        double res =0; 
        double sum=0;
        for(int l = 0;l<k;l++){
             sum += nums[l];
        }
        res = sum/(k*1.0000);
        
        while(j<nums.length){
            sum+=nums[j];
            j++;
            sum-=nums[i];
            i++;
            double sol = sum/(k*1.0000);
            res = Math.max(sol,res);
        }
        return res;
          
    }
}