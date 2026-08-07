class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c =0;
        int m =0;
        int five =0;
        int ten = 0;
        boolean flag = false;
        for(int cash : bills){
            if(cash == 5){
                five++;
            }
            else if(cash == 10){
                if(five>0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else if(cash == 20){
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}