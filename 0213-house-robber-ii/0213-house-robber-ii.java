class Solution {
    public int robb(int nums[]){
        if(nums.length == 0 || nums== null){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length;
        int dp[]= new int[n];
        dp[0]=nums[0];
        dp[1]= Math.max(nums[0],nums[1]);
    
        for(int i=2;i<n;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int arr1[] = new int[nums.length-1];int j = 0;
        int arr2[] = new int[nums.length-1];int k = 0;

        for(int i=0;i<nums.length;i++){
            if(i!=0){
                arr1[j++] = nums[i];
            }
            if(i!= nums.length-1){
                arr2[k++] = nums[i];
            }
        }
        return Math.max(robb(arr1),robb(arr2));
    }
}