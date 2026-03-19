class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ma = 0;
        int ca = 0;
        while(left<right){
            ca = (int)(Math.min(height[left],height[right])) * (right -left);
            ma = (int)(Math.max(ca,ma));
            if(height[left]<=height[right]){
                left++;
            }
            else if(height[left]>height[right]){
                right--;
            }
        }
        return ma;

    }
}