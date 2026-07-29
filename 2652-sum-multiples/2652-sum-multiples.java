class Solution {
    public boolean isdivisible(int m){
        if(m%3==0|| m%5==0||m%7==0){
            return true;
        }
        return false;
    }
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i =1;i<=n;i++){
            if(isdivisible(i)){
                sum+=i;
            }
        }
        return sum;
    }
}