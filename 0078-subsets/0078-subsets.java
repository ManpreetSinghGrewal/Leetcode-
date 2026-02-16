class Solution {
       public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void helper(int index, int[] nums,
                        List<Integer> current,
                        List<List<Integer>> result) {

        // base case: processed all elements
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // 1️⃣ not take nums[index]
        helper(index + 1, nums, current, result);

        // 2️⃣ take nums[index]
        current.add(nums[index]);
        helper(index + 1, nums, current, result);
        current.remove(current.size() - 1); 
    }

    
}