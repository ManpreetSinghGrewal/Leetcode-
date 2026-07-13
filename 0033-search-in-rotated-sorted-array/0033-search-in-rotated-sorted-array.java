import java.util.HashMap;

class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store element and its index
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Check if target exists
        if (map.containsKey(target)) {
            return map.get(target);
        }

        return -1; // target not found
    }
}
