class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int psum = 0;
        int res =0;
        map.put(0,1);
        for(int i =0;i<nums.length;i++){
            psum += nums[i];
            if(map.containsKey(psum -k)){
                res+= map.get(psum - k);
            }
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return res;

    }
}