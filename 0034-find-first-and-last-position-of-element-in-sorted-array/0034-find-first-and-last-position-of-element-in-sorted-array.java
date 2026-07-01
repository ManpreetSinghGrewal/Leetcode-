class Solution {
    public int findfirst(int[] nums,int target){
        int left = 0;
        int right= nums.length-1;
        int firsti = -1;
        while(left<=right){
            int mid = left + (right-left) /2;
            if(nums[mid] == target){
                firsti = mid;
                right = mid-1;
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }
        return firsti;
    }
    public int findlast(int[] nums,int target){
        int left = 0;
        int right= nums.length-1;
        int lasti = -1;
        while(left<=right){
            int mid = left + (right-left) /2;
            if(nums[mid] == target){
                lasti = mid;
                left = mid+1 ;
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }
        return lasti;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[] { -1,-1 };
        }
        int first = findfirst(nums,target);
            int last = findlast(nums,target);
            return new int[] { first, last };
    }
}