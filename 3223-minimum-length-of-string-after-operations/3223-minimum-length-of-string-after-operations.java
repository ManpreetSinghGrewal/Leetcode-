class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = 0;
        for(char k : map.keySet()){
            int v = map.get(k);
            if(v%2 == 1){
                count+= v - (v-1);
            }
            else{
                count+= v - (v-2);
            }
        }

        return count;
    }
}