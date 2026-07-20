class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int dups=0;
        for(int i =0;i<k;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i],map.get(nums[i])+1);

            sum = sum + nums[i];

            if(map.get(nums[i]) >1){
                dups = dups+1;
            }
        }
        if(dups == 0){
            max = Math.max(max,sum);
        }
        for(int i =k;i<nums.length;i++){
            int numtoadd = nums[i];
            int numtoremove = nums[i-k];

            if(!map.containsKey(numtoadd)){
                map.put(numtoadd,0);
            }
            map.put(numtoadd,map.get(numtoadd)+1);

            if(map.get(nums[i]) >1){
                dups = dups+1;
            }
            sum = sum + numtoadd;

            if(map.get(numtoremove) >1){
                dups =dups-1;
            }
            map.put(numtoremove,map.get(numtoremove) -1);

            sum = sum - numtoremove;
            if(dups ==0){
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}