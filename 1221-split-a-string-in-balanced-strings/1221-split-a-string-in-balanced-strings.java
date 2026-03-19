class Solution {
    public int balancedStringSplit(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        int ct =0;
        int l = 0;
        int r = 0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'L'){
                l++;
            }
            if(c == 'R'){
                r++;
            }
            if(l == r){
                ct++;
            }
        }
        return ct;
    }
}