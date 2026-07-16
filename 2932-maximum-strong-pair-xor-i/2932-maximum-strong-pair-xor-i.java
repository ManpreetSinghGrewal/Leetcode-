class Solution {
    public boolean good(int a,int b){
        if(Math.abs(a-b) <= Math.min(a,b)){
            return true;
        }
        return false;
    }
    public int maximumStrongPairXor(int[] nums) {
        int i =0;
        int c = 0;
        int res = 0;
        while(i<nums.length){
            int x=nums[i];
            int j =i;
            while(j<nums.length){
                if(good(x,nums[j])){
                    c++;
                    res = Math.max(res,x^nums[j]);
                }

                j++;
            }
            i++;
        }
        return res;
    }
}