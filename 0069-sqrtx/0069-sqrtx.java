class Solution {
    public int mySqrt(int x) {
        int res =-1;
        if(x<2){
            return x;
        }
        int left = 1;
        int right = x;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(mid == (x/mid)){
                res = mid;
                return mid;
            }
            else if(mid < (x/mid)){
                res = mid;
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return res;
    }
}