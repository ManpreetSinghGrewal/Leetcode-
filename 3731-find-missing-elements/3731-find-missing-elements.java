class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int j =0;
        for(int i = nums[0];i<nums[n-1];i++){
            if(nums[j] == i){
                while(j<n && nums[j] == i){
                    j++;
                }
            }
            else{
                list.add(i);
            }
        }
        
        return list;
    }
}