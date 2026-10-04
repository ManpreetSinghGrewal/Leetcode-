class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = num1;i<=num2;i++){
            ans += get(i);
        }
        return ans;
    }
    int get(int n){
        String s = Integer.toString(n);
        int c = 0;
        char arr[] = s.toCharArray();
        for(int i = 1;i<arr.length-1;i++){
            if((arr[i]>arr[i-1] && arr[i] > arr[i+1]) || (arr[i]<arr[i-1] && arr[i] < arr[i+1])){
                c++;
            }
        }
        return c;
    }
}