class Solution {
    public int findContentChildren(int[] ch, int[] co) {
        Arrays.sort(ch);
        Arrays.sort(co);
        int l = 0;
        int r = 0;
        while(l<co.length && r<ch.length){
            if(co[l] >= ch[r]){
                r++;
            }
            l++;
        }
        return r;
    }
}