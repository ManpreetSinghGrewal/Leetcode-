class Solution {
    public int reverseDegree(String s) {
        int td = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int iis = i + 1;
            
            int rai = 26 - (ch - 'a');
            
            td += rai * iis;
        }
        
        return td;
    }
}
 