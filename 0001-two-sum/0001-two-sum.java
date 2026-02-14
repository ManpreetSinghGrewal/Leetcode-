class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap <>();
        int res[] = new int[2];
         for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current ;
            if(map.containsKey(needed)){
                res[0] = map.get(needed); // The previously found index
                res[1] = i;    
                return res;
            }
            else{
                map.put(current,i);
            }
         }
         return res;
    }
}