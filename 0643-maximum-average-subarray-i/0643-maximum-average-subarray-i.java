class Solution {
    public double findMaxAverage(int[] arr, int k) {
                // Code here
       int n = arr.length;
       
       int i =0;int j=0;
       double sum = 0;
       double maxsum = -999999;
       double avg = 0;
       while(j<n){
           sum += arr[j];
           if(j -i+1 <k){
               j++;
           }
           else if(j-i+1 == k){
               if(sum >maxsum){
                   maxsum = sum;
               }
               sum -= arr[i];
               j++;
               i++;
               
           }
       }
       return maxsum/k;
    }
}