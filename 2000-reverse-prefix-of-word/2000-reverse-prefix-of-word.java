class Solution {
    public String reverse(String word){
        int n = word.length();
        StringBuilder sb  = new StringBuilder();
        for(int i =n-1;i>=0;i--){
            sb.append(word.charAt(i));
        }
        return sb.toString();

    }
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) {
            return word;
        }
        StringBuilder sb= new StringBuilder();
        String torev = word.substring(0,idx+1);
        String rev = reverse(torev);
        sb.append(rev);
        sb.append(word.substring(idx+1,word.length()));
        return sb.toString();

    }
}