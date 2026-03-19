class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int c = 0;
        for(int i = 0;i<n;i++){
            int d = 0;
            int a = nums[i];
            while(a >0){
                a=a/10;
                d++;
            }
            if(d %2 == 0){
                c++;
            }
        }
        return c;
    }
}