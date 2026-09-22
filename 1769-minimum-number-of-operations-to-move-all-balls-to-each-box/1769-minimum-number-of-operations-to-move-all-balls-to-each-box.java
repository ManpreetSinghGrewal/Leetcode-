class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int res[] = new int[boxes.length()];
        int cumval = 0;
        int cumvalsum = 0;

        for(int i = 0;i<n;i++){
            res[i] = cumvalsum;
            cumval += boxes.charAt(i) == '0'? 0 : 1 ;
            cumvalsum+= cumval;
        }
        cumval= 0;
        cumvalsum = 0;
        for(int i = n-1;i>=0;i--){
            res[i] += cumvalsum;
            cumval += boxes.charAt(i) == '0'? 0 : 1 ;
            cumvalsum+= cumval;
        }
        return res;
    }
}