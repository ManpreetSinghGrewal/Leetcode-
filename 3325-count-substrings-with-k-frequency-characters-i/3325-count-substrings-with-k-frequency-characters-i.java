class Solution {
    public int numberOfSubstrings(String s, int k) {
        int l = 0;
        int n = s.length();
        int count= 0;
        int r = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<s.length()){
            char c = s.charAt(r);
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r))+1);
            }
            else{
                map.put(s.charAt(r),1);
            }
            while(map.get(c) >=k){
                 map.put(s.charAt(l),map.get(s.charAt(l))-1);
                 l++;
            }
            count+= l;
            r++;
        }
        return count;
    }
}