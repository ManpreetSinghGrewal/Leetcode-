class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet <>();
        for(int a : nums){
            set.add(a);
        }

        return set.size()!=nums.length; 
    }
}