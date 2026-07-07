class Solution {
    public int mirrorDistance(int n) {
        String s= Integer.toString(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String res= new String(sb);
        int ans = Integer.valueOf(res);
        return Math.abs(ans-n);

    }
}