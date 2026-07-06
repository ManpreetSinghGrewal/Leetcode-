class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i = 0;
        int count= 0;

        int n=  nums.size();
        while(i<n){
            for(int j=i+1;j<n;j++){
                if(nums.get(i) +nums.get(j) <target){
                    count++;
                }
            }
            i++;
        }
        return count;
        
    }
}