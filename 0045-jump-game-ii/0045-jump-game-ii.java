class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int cmax = 0;
        int end = 0;
        for(int i = 0;i<nums.length-1;i++){
            cmax = Math.max(cmax,i + nums[i]);
            if(i == end){
                jumps++;
                end = cmax;
            }
        }
        return jumps;
    }
}