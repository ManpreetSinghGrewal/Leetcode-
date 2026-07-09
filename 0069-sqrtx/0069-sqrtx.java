class Solution {
    public int mySqrt(int x) {
        // Base case: handling 0 and 1 explicitly avoids division by zero
        if (x < 2) {
            return x;
        }

        int low = 1;
        int high = x;
        int res = 0;
        
        while (low <= high) {
            // Fix 1: Prevent overflow when calculating mid
            int mid = low + (high - low) / 2;
            
            // Fix 2: Use division instead of multiplication (mid * mid == x)
            if (mid == x / mid) {
                return mid;
            }
            
            if (mid < x / mid) {
                low = mid + 1;
                res = mid;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
