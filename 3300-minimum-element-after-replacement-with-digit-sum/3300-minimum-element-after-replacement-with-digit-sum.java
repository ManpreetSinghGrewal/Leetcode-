class Solution {
    public int replace(int n){
        int res = 0;
        while(n>0){
            int last = n%10;
            res+=last;
            n/=10;
        }
        return res;
    }
    public int minElement(int[] nums) {
        int ans = 92929299;
        for(int i =0;i<nums.length;i++){
            int k = replace(nums[i]);
            ans = Math.min(k,ans);
        }
        return ans;
    }
}