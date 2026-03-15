class Solution {
    public boolean ac(String s){
        int co = 0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                co++;
            }
        }
        if(co==s.length()){
            return true;
        }
        return false;
    }
    public boolean as(String s){
        int co = 0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(!Character.isUpperCase(c)){
                co++;
            }
        }
        if(co==s.length()){
            return true;
        }
        return false;
    }
    public boolean tc(String s){
        if(!Character.isUpperCase(s.charAt(0))){
        return false;
    }

    for(int i = 1; i < s.length(); i++){
        if(Character.isUpperCase(s.charAt(i))){
            return false;
        }
    }

    return true;
    }
    public boolean detectCapitalUse(String word) {
        if(ac(word) || as(word) || tc(word)){
            return true;
        }
        return false;
    }
}