class Solution {

    public int minPartitions(String n) {
        int res = 0;
        for(char c: n.toCharArray()){
            int d = c - '0';
            res = Math.max(d,res);
        }
        return res;
    }
}