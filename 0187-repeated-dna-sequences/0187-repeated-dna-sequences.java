class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> res = new HashSet<>();

        for(int i =0;i<=s.length()-10;i++){
            String sub = s.substring(i,i+10);
            if(seen.contains(sub)){
                res.add(sub);
            }
            seen.add(sub);
        }
        return new ArrayList<String>(res);
    }
}