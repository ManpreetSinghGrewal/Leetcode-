class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int j : nums){
            set.add(j);
        }
        int m = k;
        while(set.contains(m)){
            m+=k;
        }
        return m;
        
    }
}