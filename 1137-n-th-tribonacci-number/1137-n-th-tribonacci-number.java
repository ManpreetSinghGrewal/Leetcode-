class Solution {
     HashMap<Integer,Integer> map = new HashMap<>();
    public int tribonacci(int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n == 0){
            return 0;
        }
        if(n ==1){
            return 1;
        }
        if(n ==2){
            return 1;
        }
        map.put(n,tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
        return map.get(n);
    }
}