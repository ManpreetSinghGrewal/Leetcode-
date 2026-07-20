class Solution {
    public int maxDistinct(String s) {
        HashSet<Character>set = new HashSet<>();
        int l = 0;
        for(int i =0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                l++;
                set.add(s.charAt(i));
            }
            
        }
        return l;
    }
}