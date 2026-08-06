class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int res =0;
        Map<Integer,Integer> map = new HashMap();
        map.put(0,-1);
        for(int i =0;i<n;i++){
            if(nums[i] ==0){
                nums[i] = -1;
            }
        }
        int sum =0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                int a= map.get(sum);
                res= Math.max(res,i-a);
            }
            else{
                map.put(sum,i);
            }
        }
        return res;
    }
}