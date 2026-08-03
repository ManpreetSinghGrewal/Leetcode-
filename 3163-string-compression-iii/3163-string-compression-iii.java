class Solution {
    public String compressedString(String word) {
        int n = word.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i<n){
            int count = 0;
            char ch = word.charAt(i);
            while(i<n && word.charAt(i) == ch && count<9){
                count++;
                i++;
            }
            sb.append(count).append(ch);
        }
        return sb.toString();
    
    }
}