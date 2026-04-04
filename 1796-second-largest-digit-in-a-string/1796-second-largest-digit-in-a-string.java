class Solution {
    public int secondHighest(String s) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch) && !list.contains(Character.getNumericValue(ch))){
                list.add(Character.getNumericValue(ch));
            }
        }
        if(list.size() <2)return -1;
        Collections.sort(list);
        int n = list.size();
        return list.get(n-2);
    }
}