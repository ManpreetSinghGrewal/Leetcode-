class Solution {
    public int sos(int n){
        int sum =0;
        while(n>0){
            int l = n%10;
            sum+= l*l;
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n ;
        int fast = n;
        while(fast!=1){
            slow = sos(slow);
            fast = sos(sos(fast));
            if(fast == 1){
                return true;
            }
            if(slow == fast){
                return false;
            }
        }
        return true;

        
    }
}