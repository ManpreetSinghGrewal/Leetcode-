class Solution {
    public int subtractProductAndSum(int n) {
        int num = n;
        int p = 1;
        int s = 0;
        while(num>0){
            int l= num%10;
            s += l;
            p *= l;
            num /= 10;
        }
        return p-s;
    }
}