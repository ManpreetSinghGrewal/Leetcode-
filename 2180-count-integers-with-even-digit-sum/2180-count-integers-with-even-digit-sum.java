class Solution {
    public int countEven(int num) {
        int c = 0;
        for(int i =1;i<=num;i++){
             if(sod(i)%2==0){
                c++;
             }
        }
             return c;
    }
    private int sod(int n){
        int k = n;
        int s = 0;
        while(k>0){
            int l = k%10;
            s+=l;
            k=k/10;
        }
        return s;
    }
}