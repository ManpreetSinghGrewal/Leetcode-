class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int a = k * threshold;
        int count = 0;
        int sum =0;
        for(int i =0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=a){
            count++;
        }
        for(int i =k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum>=a){
                count++;
            }
        }
        return count;
    }
}