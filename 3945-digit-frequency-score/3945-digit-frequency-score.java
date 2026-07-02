class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer>map = new HashMap<>();
        int num = n;
        while(num>0){
            int l = num%10;
            map.put(l,map.getOrDefault(l,0)+1);
            num/=10;
        }
        int res= 0;
        for(int k :map.keySet()){
            res+= k * map.get(k);
        }
        return res;
    }
}