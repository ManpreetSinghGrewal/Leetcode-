class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Calculate the total sum of all elements
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            // Subtract current element from rightSum to get elements strictly to its right
            rightSum -= nums[i];
            
            // Calculate absolute difference
            answer[i] = Math.abs(leftSum - rightSum);
            
            // Add current element to leftSum for the next iterations
            leftSum += nums[i];
        }
        
        return answer;
    }
}
