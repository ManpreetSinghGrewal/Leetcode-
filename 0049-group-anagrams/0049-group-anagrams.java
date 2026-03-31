class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char chars[] = str.toCharArray();
            Arrays.sort(chars);
            String sortedstring = new String(chars);
            if(map.containsKey(sortedstring) == false){
                map.put(sortedstring,new ArrayList<>());
            }
            map.get(sortedstring).add(str);
        }
        result.addAll(map.values());
        return result;
    }
}