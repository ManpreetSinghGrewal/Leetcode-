class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] ch =  s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(!isvowel(ch[start])){
                start++;
            }
            else if(!isvowel(ch[end])){
                end--;
            }
            else{
                char temp  = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    public static boolean isvowel(char c){
        if(c =='a' || c =='o'||c =='u' ||c =='e' ||c =='i'
        ||c =='A' || c =='O'||c =='U' ||c =='E' ||c =='I' ){
            return true;
        }
        return false;
    }
}