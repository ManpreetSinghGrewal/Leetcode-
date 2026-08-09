class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        int oddcount = 0;
        map.put(0,1);

        for(int i = 0;i<nums.length;i++){
            oddcount+= nums[i]%2;
            if(map.containsKey(oddcount-k)){
                result+= map.get(oddcount - k);
            }
             map.put(oddcount, map.getOrDefault(oddcount, 0) + 1);
        }
        return result;
    }
}