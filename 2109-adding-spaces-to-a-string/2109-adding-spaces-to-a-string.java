class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int si = 0;
        for(int i = 0;i<s.length();i++){
            if(si<spaces.length && i == spaces[si]){
                sb.append(' ');
                si++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}