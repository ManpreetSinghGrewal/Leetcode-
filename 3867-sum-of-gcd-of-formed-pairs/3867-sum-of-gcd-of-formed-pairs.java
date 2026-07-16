class Solution {
    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        long a= nums[0];
        long mx = 0;
        long prefixGcd[] = new long[nums.length];
        for(int i = 0;i<nums.length;i++){
            mx = Math.max(nums[i],mx);
            prefixGcd[i] = gcd(mx,nums[i]);
        }
        Arrays.sort(prefixGcd);
        long sum = 0;
        int i =0;
        int j = nums.length-1;
        while(i<j){
            sum+=gcd(prefixGcd[i],  prefixGcd[j]);
            i++;
            j--;
        }
        return sum;

        
    }
}