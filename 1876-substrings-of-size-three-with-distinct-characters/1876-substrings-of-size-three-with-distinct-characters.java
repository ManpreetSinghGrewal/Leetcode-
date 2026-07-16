class Solution {
    public boolean good(String s) {
        if(s.charAt(0) != s.charAt(1)  &&s.charAt(1)!= s.charAt(2) && s.charAt(0)!=s.charAt(2)  ){
            return true;
        }
        return false;
    }
    public int countGoodSubstrings(String s) {
        int i=0;
        int c = 0;
        while(i<=s.length()-3){
            String ss = s.substring(i,i+3);
                if(good(ss)){
                    c++;
                }
            i++;
        }  
        return c;
    }
}
