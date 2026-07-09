class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int low = 1;
        int high = x;
        int res =0;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(mid == x/mid){
                return mid;
            }
            if(mid<x/mid){
                low = mid+1;
                res=mid;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
}