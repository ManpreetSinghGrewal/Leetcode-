class Solution { 
    public int trap(int[] height) { 
        int l = 0; 
        int r = height.length - 1; 
        int leftMax = 0; 
        int rightMax = 0; 
        int rainwater = 0; 
        while(l<r){
            if(height[l] <= height[r]){
                leftMax = Math.max(height[l],leftMax);
                rainwater += leftMax-height[l];
                l++;
            }
            else{
                rightMax = Math.max(height[r],rightMax);
                rainwater += rightMax-height[r];
                r--;
            }

        }
        return rainwater;
    } 
}
