class Solution {
    public long maxAlternatingSum(int[] nums) {
        long arr[] = new long[nums.length];
        for(int i =0;i<nums.length;i++){
            arr[i] = (long)nums[i] *nums[i];
        }
        long res =0;
        Arrays.sort(arr);
        long a = 0;
        long s = 0;
        for(int i = arr.length-1;i>=0;i--){
            if(i >= (arr.length)/2){
                a+=arr[i];
            }
            else{
                s+=arr[i];
            }
        }
        res+=a;
        res-=s;
        return res;
    }
}