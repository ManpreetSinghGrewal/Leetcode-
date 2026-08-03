class Solution {
    public int compress(char[] chars) {
        int i =0;
        int n = chars.length;
        int edit = 0;
        while(i<n){
            char curr = chars[i];
            int count= 0;
            while(i<n&& chars[i]== curr){
                i++;
                count++;
            }
            chars[edit++] = curr;
            if(count>1){
                String st = Integer.toString(count);
                for(char ch: st.toCharArray()){
                    chars[edit++] = ch;
                }
            } 
        }
        return edit;
    }
}