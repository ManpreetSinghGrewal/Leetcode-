class Solution {
    public int[] shuffle(int[] nums, int n) {
    
       
        int[] res = new int[2*n];
        int idx = 0;
        for(int i =0;i<2*n;i+=2){
            res[i] = nums[idx++];
        }
        for(int j=1;j<2*n;j+=2){
            res[j] = nums[idx++];
        }
        return res;
    }
}