class Solution { 
    public int numSubarrayProductLessThanK(int[] nums, int k) { 
        
        if (k <= 1) return 0;

        int i = 0; 
        int res = 0; 
        
        while(i < nums.length){ 
            int j = i; 
            int p = 1; 
            
            while(j < nums.length){ 
                p *= nums[j]; 

                if(p < k){ 
                    res++; 
                } else {
                    break; 
                }
                j++; 
            } 
            i++; 
        } 
        return res; 
    } 
}
