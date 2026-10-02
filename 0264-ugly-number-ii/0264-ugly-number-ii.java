class Solution {
    
    public int nthUglyNumber(int n) {
        int i2,i3,i5 ;
        i2 = i5 = i3 = 1;
        int arr[] = new int[n+1];
        arr[1] = 1;
        for(int i = 2;i<=n;i++){
            int a = arr[i2] * 2;
            int b = arr[i3] * 3;
            int c = arr[i5] * 5;
            arr[i] = Math.min(Math.min(a,b),c);
            if(arr[i] == a){
                i2++;
            }
            if(arr[i] == b){
                i3++;
            }if(arr[i] == c){
                i5++;
            }
        }
        return arr[n];
    }
}