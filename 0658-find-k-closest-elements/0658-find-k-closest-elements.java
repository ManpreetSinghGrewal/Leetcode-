class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int left =0;
        int right= arr.length-1;
        if(k==arr.length){
            for(int ele: arr){
                res.add(ele);
            }
            return res;
        }
        while(left<right){
            int mid = left + (right-left)/2;

            if(arr[mid]>=x){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        left = right -1;
        int i =0;
        while(i<k){
            if(left == -1){
                right = right+1;
            }
            else if(right == arr.length){
                left = left-1;
            }
            else if(Math.abs(arr[right] - x)< Math.abs(arr[left] - x)){
                right = right +1;
            }
            else{left = left -1;}
            i++;
        }
        for(int j = left+1;j<right;j++){
            res.add(arr[j]);
        }
        return res;
    }
}