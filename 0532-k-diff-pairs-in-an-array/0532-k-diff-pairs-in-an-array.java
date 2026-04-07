class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer> set = map.keySet();
        for(int num:set){
            if(k>0 && map.containsKey(num+k)){
                count++;
            }
            if(k==0 && map.get(num)>1){
                count++;
            }
        }
        return count;
    }

}