class Solution {
    public int maxVowels(String s, int k) {
        int i =0;
        int j = k;
        int ans = 0;
        Set<Character> set = Set.of('a','e','i','o','u');
        for(int n =0;n<k;n++){
            if(set.contains(s.charAt(n)))
            ans++;
        }
        int res = ans;
        while(j<s.length()){
        
            if(set.contains(s.charAt(i))){
                res--;
            }
            if(set.contains(s.charAt(j))){
                res++;
            }
            i++;
            j++;
            ans = Math.max(res,ans);
        }
        return ans;
    }
}