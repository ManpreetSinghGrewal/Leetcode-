class Solution {
    public boolean consecutiveSetBits(int n) {
        String binarys = Integer.toBinaryString(n);
        int count = 0;

        for(int i=0;i<binarys.length()-1;i++){
            char ch1 = binarys.charAt(i);
            char ch2 = binarys.charAt(i+1);
            if(ch1 == '1' && ch2 == '1'){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
        
    }
}