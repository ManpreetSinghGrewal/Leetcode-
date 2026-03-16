class Solution {
    public boolean validMountainArray(int[] arr) {
        int s = arr.length;
        if(s<3){
            return false;
        }
        int i = 0;
        int j = s-1;
        while(i+1<s && arr[i]<arr[i+1]){
            i++;
        }
        while(j>0 && arr[j-1]>arr[j]){
            j--;
        }
        if(i>0 && j<s-1){
            if(i==j){
               return true; 
            }    
        }
        return false;
    }
}