import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> subarrayCountMap = new HashMap<>();
        int n = nums.length;
        
        for (int i = 0; i <= n - k; i++) {
            HashSet<Integer> uniqueInCurrentSubarray = new HashSet<>();
            
            for (int j = i; j < i + k; j++) {
                uniqueInCurrentSubarray.add(nums[j]);
            }
            
            for (int num : uniqueInCurrentSubarray) {
                subarrayCountMap.put(num, subarrayCountMap.getOrDefault(num, 0) + 1);
            }
        }
        
        int largest = -1;
        
        for (int num : subarrayCountMap.keySet()) {
            if (subarrayCountMap.get(num) == 1) {
                largest = Math.max(largest, num);
            }
        }
        
        return largest;
    }
}
