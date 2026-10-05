class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int prev = 0;
        int res = 0;
        for(int i = 0;i<n;i++){
            int curr = 0;
            for(char x: bank[i].toCharArray()){
                if(x == '1'){
                    curr++;
                }
            }
            res+= prev * curr;
            if(curr != 0){
                prev = curr;
            }
        }
        return res;
    }
}