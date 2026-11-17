class Solution {
    public boolean te(String sub){
        if((sub.charAt(0) == sub.charAt(1)) && (sub.charAt(1) == sub.charAt(2)) ) return true;
        else{
            return false;
        }
    }
    public String makeFancyString(String s) {
        StringBuilder sb  = new StringBuilder();
        if(s.length()<3){
            return s;
        }
        if(s.length() == 3){
            if(te(s)){
                return s.substring(0,2);
            }
            else{
                return s;
            }
        }
        for(int i = 0;i<=s.length()-3;i++){
            String sub = s.substring(i,i+3);
            if(!te(sub)){
                sb.append(s.charAt(i));
            }
        }
        for(int i = s.length() -2;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
//leeetcode
//012345678