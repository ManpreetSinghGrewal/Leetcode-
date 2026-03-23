class Solution {
    public int removeDuplicates(int[] nums) {
        // int k =0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //         k++;
        //         nums[k] = nums[i];
        //     }
        // }
        // return k+1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        int k =0;
        for(int i =0;i<list.size();i++){
            nums[k] = list.get(i);
            k++;
        }
        return k;
    }
}