class Solution {
    public int da(int n,int dig){
        int d=n;
        int res = 0;
        while(d>0){
            int l = d%10;
            if(l == dig){
                res++;
            }
            d/=10;
        }
        return res;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for(int i =0;i<nums.length;i++){
            ans+= da(nums[i],digit);
        }
        return ans;
    }
}