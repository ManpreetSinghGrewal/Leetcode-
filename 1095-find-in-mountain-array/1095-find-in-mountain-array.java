/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    private int findpeak(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            // FIX 1: Safely handle boundaries instead of hardcoding 'return 1'
            int curr = mountainArr.get(mid);
            int left = (mid > 0) ? mountainArr.get(mid - 1) : Integer.MIN_VALUE;
            int right = (mid < mountainArr.length() - 1) ? mountainArr.get(mid + 1) : Integer.MIN_VALUE;
            
            if(curr > left && curr > right){
                return mid;
            }
            else if(curr > left && curr < right){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    
    private int BSA(int target,MountainArray arr,int start,int end){
        while(end>=start){
            int mid= start + (end - start)/2;
            if(arr.get(mid) == target ){
                return mid;
            }
            else if(arr.get(mid) <target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    private int BSD(int target,MountainArray arr,int start,int end){
        while(end>=start){
            int mid= start + (end - start)/2;
            if(arr.get(mid) == target ){
                return mid;
            }
            else if(arr.get(mid) > target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length();
        int peak = findpeak(mountainArr);
        if(target>mountainArr.get(peak))return -1;
        int res =-1;
        res= BSA(target,mountainArr,0,peak);
        if(res!=-1)return res;
        res = BSD(target,mountainArr,peak,mountainArr.length()-1);
        return res;


        
    }
}